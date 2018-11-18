package com.sprinfnew.demoapp.userDataOperations;

public class UserDO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public UserDO() {
    }

    public UserDO(String firstName, String lastName, String phoneNumber, String emailAddress, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
