package com.dgs.graphql.entity;


import com.dgs.graphql.enums.EGender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "employee")
public class EmployeeEntity {
    private String _id;

    private String fullname;

    private EGender gender;

    private List<AddressEntity> addressList;

    private DepartmentEntity department;
}
