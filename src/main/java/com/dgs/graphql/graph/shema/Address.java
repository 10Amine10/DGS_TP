package com.dgs.graphql.graph.shema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Address {
  private String state;

  private String country;

  private String addressLine1;

  private String addressLine2;

  private String pinCode;

  private AddressType addressType;

  public Address() {
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public AddressType getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressType addressType) {
    this.addressType = addressType;
  }

  @Override
  public String toString() {
    return "Address{" + "state='" + state + "'," +"country='" + country + "'," +"addressLine1='" + addressLine1 + "'," +"addressLine2='" + addressLine2 + "'," +"pinCode='" + pinCode + "'," +"addressType='" + addressType + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return java.util.Objects.equals(state, that.state) &&
                            java.util.Objects.equals(country, that.country) &&
                            java.util.Objects.equals(addressLine1, that.addressLine1) &&
                            java.util.Objects.equals(addressLine2, that.addressLine2) &&
                            java.util.Objects.equals(pinCode, that.pinCode) &&
                            java.util.Objects.equals(addressType, that.addressType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(state, country, addressLine1, addressLine2, pinCode, addressType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String state;

    private String country;

    private String addressLine1;

    private String addressLine2;

    private String pinCode;

    private AddressType addressType;

    public Address build() {
                  Address result = new Address();
                      result.state = this.state;
          result.country = this.country;
          result.addressLine1 = this.addressLine1;
          result.addressLine2 = this.addressLine2;
          result.pinCode = this.pinCode;
          result.addressType = this.addressType;
                      return result;
    }

    public Builder state(String state) {
      this.state = state;
      return this;
    }

    public Builder country(String country) {
      this.country = country;
      return this;
    }

    public Builder addressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public Builder addressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public Builder pinCode(String pinCode) {
      this.pinCode = pinCode;
      return this;
    }

    public Builder addressType(AddressType addressType) {
      this.addressType = addressType;
      return this;
    }
  }
}
