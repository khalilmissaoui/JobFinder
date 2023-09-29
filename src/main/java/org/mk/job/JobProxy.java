package org.mk.job;

import org.mk.shared.Region;

import java.util.ArrayList;
import java.util.List;

public class JobProxy implements JobPortal {

    private JobPortal jobPortal;
    private Region seekerRegion;
    private List<Region> ALLOWED_REGION;
    public JobProxy(Region region) {
        this.seekerRegion = region;
        this.jobPortal = new JobWebsite();
        this.ALLOWED_REGION = new ArrayList<Region>();
        this.ALLOWED_REGION.add(Region.NORTH);
        this.ALLOWED_REGION.add(Region.SOUTH);
    }


    @Override
    public List<Job> findJob() {
        if(ALLOWED_REGION.contains(seekerRegion))
        return jobPortal.findJob();

        return new ArrayList<Job>();
    }
}
