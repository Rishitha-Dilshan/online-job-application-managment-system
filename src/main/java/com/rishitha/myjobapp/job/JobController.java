package com.rishitha.myjobapp.job;

import com.rishitha.myjobapp.job.JobImpl.JobServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class JobController {

    private JobServiceImpl JobServiceImpl;

    public JobController(JobServiceImpl JobServiceImpl) {
        this.JobServiceImpl = JobServiceImpl;
    }

    @GetMapping("/jobs")
    public List<Job> findall(){
        return JobServiceImpl.findAll();
    }

    @PostMapping("/jobs")
    public String createjobs(@RequestBody Job job){
        JobServiceImpl.createJob(job);
        return "Jobs added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){
        Job job = JobServiceImpl.getJobById(id);
        if(job!=null)
            return job;
        return new Job(1L,"TestJob","TestJob","1000","2000","1500","Colombo");

    }
}
