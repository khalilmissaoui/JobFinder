package org.mk.job;

public class Job {
    private String city;
    private String salary;
    private String description;


    public Job(String city, String salary, String description) {
        this.city = city;
        this.salary = salary;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public String getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }
}
