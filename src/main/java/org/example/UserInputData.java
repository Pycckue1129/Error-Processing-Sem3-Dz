package org.example;

public class UserInputData {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final long phoneNumber;

    public UserInputData(String lastName, String firstName, String middleName, long phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "<" + lastName + ">" + "<" + firstName + ">" + "<" + middleName + ">" + "<" + phoneNumber + ">";
    }
}