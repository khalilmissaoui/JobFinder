package org.mk.person;

import org.mk.shared.Region;

public class PersonDetails {


    private String city;
    private String work;
    private Region region;


    public PersonDetails(String city, String work, Region region) {
        this.city = city;
        this.work = work;
        this.region = region;
    }


    public Region getRegion() {
        return region;
    }
    public String getCity() {
        return city;
    }

    public String getWork() {
        return work;
    }
}
