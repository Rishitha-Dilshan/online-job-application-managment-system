package com.rishitha.myjobapp.job.JobImpl;


import com.rishitha.myjobapp.job.Job;

import java.util.List;


public interface JobServiceImpl {
    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean upadateJobById(Long id, Job updatedJob);
}
