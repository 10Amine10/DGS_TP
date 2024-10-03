package com.dgs.graphql.graph.shema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Employee {
  private String _id;

  private String fullname;

  private Gender gender;

  private List<Address> addressList;

  private Department department;

  public Employee() {
  }

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public List<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" + "_id='" + _id + "'," +"fullname='" + fullname + "'," +"gender='" + gender + "'," +"addressList='" + addressList + "'," +"department='" + department + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return java.util.Objects.equals(_id, that._id) &&
                            java.util.Objects.equals(fullname, that.fullname) &&
                            java.util.Objects.equals(gender, that.gender) &&
                            java.util.Objects.equals(addressList, that.addressList) &&
                            java.util.Objects.equals(department, that.department);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(_id, fullname, gender, addressList, department);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String _id;

    private String fullname;

    private Gender gender;

    private List<Address> addressList;

    private Department department;

    public Employee build() {
                  Employee result = new Employee();
                      result._id = this._id;
          result.fullname = this.fullname;
          result.gender = this.gender;
          result.addressList = this.addressList;
          result.department = this.department;
                      return result;
    }

    public Builder _id(String _id) {
      this._id = _id;
      return this;
    }

    public Builder fullname(String fullname) {
      this.fullname = fullname;
      return this;
    }

    public Builder gender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public Builder addressList(List<Address> addressList) {
      this.addressList = addressList;
      return this;
    }

    public Builder department(Department department) {
      this.department = department;
      return this;
    }
  }
}
