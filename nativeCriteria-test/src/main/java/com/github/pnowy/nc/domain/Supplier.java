package com.github.pnowy.nc.domain;

import com.google.common.base.MoreObjects;

/**
 * Supplier entity for testing the NativeBeanPropertyMapper.
 *
 * @author Przemek Nowak
 */
public class Supplier extends AbstractEntity {
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String vatIdentificationNumber;
    protected String phoneNumber;
    protected String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVatIdentificationNumber() {
        return vatIdentificationNumber;
    }

    public void setVatIdentificationNumber(String vatIdentificationNumber) {
        this.vatIdentificationNumber = vatIdentificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .add("firstName", firstName)
            .add("lastName", lastName)
            .add("vatIdentificationNumber", vatIdentificationNumber)
            .add("phoneNumber", phoneNumber)
            .add("email", email)
            .toString();
    }
}
