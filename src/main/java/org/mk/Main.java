package org.mk;

import org.mk.job.Job;
import org.mk.job.JobProxy;
import org.mk.person.Person;
import org.mk.person.PersonDetails;
import org.mk.shared.Region;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Flyweight pattern
        PersonDetails khalilDetails = new PersonDetails("tunis","software engnieer", Region.NORTH); // change this to another region to test the proxy
        Person person = new Person("khalil missaoui",432234,khalilDetails);

        JobProxy jobProxy = new JobProxy(person.getDetails().getRegion());

        List<Job> jobList = jobProxy.findJob();
        if (jobList.isEmpty())  System.out.println("no jobs for your region")   ;
        else
        for (Job job: jobList ) {
            System.out.println(job.getCity() + " has a job with salary " + job.getSalary()  );
        }

    }
}