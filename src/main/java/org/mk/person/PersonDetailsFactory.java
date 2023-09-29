package org.mk.person;

import org.mk.shared.Region;

import java.util.HashMap;
import java.util.Map;

public class PersonDetailsFactory {

    private static final Map<String, PersonDetails> personDetails = new HashMap<>();

    public static PersonDetails getPersonDetails(String city , String work , Region region) {
        if (personDetails.get(region.toString()) == null) {
            personDetails.put(region.toString(), new PersonDetails(city, work, region));
        }
        return personDetails.get(region.toString());
    }
}
