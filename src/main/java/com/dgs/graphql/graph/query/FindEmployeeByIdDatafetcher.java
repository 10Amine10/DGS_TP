package com.dgs.graphql.graph.query;

import com.dgs.graphql.Repository.DepartmentRepo;
import com.dgs.graphql.Repository.EmployeeRepo;
import com.dgs.graphql.entity.EmployeeEntity;
import com.dgs.graphql.graph.shema.Employee;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;

@DgsComponent
@AllArgsConstructor
public class FindEmployeeByIdDatafetcher {

  private EmployeeRepo employeeRepo;
  private DepartmentRepo departmentRepo;


  @DgsData(
      parentType = "Query",
      field = "findEmployeeById"
  )
  public Employee getFindEmployeeById(DataFetchingEnvironment dataFetchingEnvironment) {
    String employeeId = dataFetchingEnvironment.getArgument("employeeId");
    ObjectId objectId = new ObjectId(employeeId);
    EmployeeEntity employeeEntity = employeeRepo.findEmployeeById(objectId);
    System.out.println("Employé récupéré: " + employeeEntity);
    if (employeeEntity == null) {
      throw new IllegalArgumentException("L'employé avec l'ID " + employeeId + " n'existe pas.");
    }
    return new ModelMapper().map(employeeEntity, Employee.class);


  }
}
