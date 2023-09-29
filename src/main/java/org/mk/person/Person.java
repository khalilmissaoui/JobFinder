package org.mk.person;

public class Person {

    private final String fullName;
    private final int cin;
    private final PersonDetails details;

    public Person(String fullName, int cin, PersonDetails details) {
        this.fullName = fullName;
        this.cin = cin;
        this.details = details;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCin() {
        return cin;
    }

    public PersonDetails getDetails() {
        return details;
    }
}