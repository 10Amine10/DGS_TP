package com.dgs.graphql.graph.query;


import com.dgs.graphql.Repository.EmployeeRepo;
import com.dgs.graphql.entity.AddressEntity;
import com.dgs.graphql.entity.DepartmentEntity;
import com.dgs.graphql.entity.EmployeeEntity;
import com.dgs.graphql.enums.EGender;
import com.dgs.graphql.graph.shema.Employee;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@DgsComponent
@AllArgsConstructor
public class AddEmployeeDatafetcher {

    private final EmployeeRepo employeeRepo;

    @DgsData(
            parentType = "Mutation",
            field = "addEmployee"
    )
    public Employee addEmployee(DataFetchingEnvironment dataFetchingEnvironment) {

        // Récupérer les arguments de la requête GraphQL
        String fullname = dataFetchingEnvironment.getArgument("fullname");
        String gender = dataFetchingEnvironment.getArgument("gender");

        // Récupérer la liste d'adresses et caster en List<Map>
        List<Map<String, Object>> addressInputList = dataFetchingEnvironment.getArgument("addressList");

        // Mapper les objets Address du schéma vers des AddressEntity (Manuellement)
        List<AddressEntity> addressEntityList = addressInputList.stream()
                .map(addressInput -> {
                   AddressEntity addressEntity = new AddressEntity();
                   addressEntity.setState((String) addressInput.get("state"));
                   addressEntity.setCountry((String) addressInput.get("country"));
                   addressEntity.setPinCode((String) addressInput.get("pinCode"));
                   return addressEntity;

                })
                .collect(Collectors.toList());

        // Mapper le département en entité
        Map<String, Object> departmentInput = dataFetchingEnvironment.getArgument("department");
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.set_id((String) departmentInput.get("_id"));
        departmentEntity.setDepartmentName((String) departmentInput.get("departmentName"));

        // Créer un nouvel EmployeeEntity
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setFullname(fullname);
        employeeEntity.setGender(EGender.valueOf(gender));
        employeeEntity.setAddressList(addressEntityList);
        employeeEntity.setDepartment(departmentEntity);

        EmployeeEntity savedEmployee = employeeRepo.save(employeeEntity);
        // Mapper l'entité sauvegardée vers l'objet GraphQL Employee et la retourner
        return new ModelMapper().map(savedEmployee, Employee.class);
    }
}
