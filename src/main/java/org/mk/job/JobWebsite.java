package org.mk.job;

import java.util.ArrayList;
import java.util.List;

public class JobWebsite implements JobPortal{


    //could ve use region as enums and have only allowed regions to access the jobs portal
    private List<Job> jobList;

    public JobWebsite() {
        //could ve added a constructor with list as param to separate the concerns , ugh im lazy
        Job job = new Job("tunis","2002","random job for playing with design pattern");
        Job job2 = new Job("tunis","1000","another random job for playing with design pattern");
        this.jobList = new ArrayList<Job>();
        this.jobList.add(job2);
        this.jobList.add(job);

    }
    @Override
    public List<Job> findJob() {
        return this.jobList;
    }
}
