package com.dgs.graphql.entity;


import com.dgs.graphql.enums.EAddressType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
    private String state;

    private String country;

    private String addressLine1;

    private String addressLine2;

    private String pinCode;

    private EAddressType addressType;
}
