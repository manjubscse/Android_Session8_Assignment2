package com.manjubs.PhoneBook;

/**
 * Created by Manju B S .
 */

// Create Person Class to As Collection
public class Person {
    private String personName; // Person name
    private String contactNumber; // Contact Number


    // Constructor to assign values to Name, Phone Number
    public Person(String personName, String contactNumber) {
        this.personName = personName;
        this.contactNumber = contactNumber;
    }

    // Getter and Setters for Name and Phone Number
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
