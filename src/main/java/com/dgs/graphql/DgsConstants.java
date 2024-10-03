package com.dgs.graphql;

import java.lang.String;

public class DgsConstants {
  public static class ADDRESS {
    public static final String TYPE_NAME = "Address";

    public static final String State = "state";

    public static final String Country = "country";

    public static final String AddressLine1 = "addressLine1";

    public static final String AddressLine2 = "addressLine2";

    public static final String PinCode = "pinCode";

    public static final String AddressType = "addressType";
  }

  public static class DEPARTMENT {
    public static final String TYPE_NAME = "Department";

    public static final String _id = "_id";

    public static final String DepartmentName = "departmentName";
  }

  public static class EMPLOYEE {
    public static final String TYPE_NAME = "Employee";

    public static final String _id = "_id";

    public static final String Fullname = "fullname";

    public static final String Gender = "gender";

    public static final String AddressList = "addressList";

    public static final String Department = "department";
  }
}
