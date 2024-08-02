
package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;
import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;



    //method to return all JobPosts






    // ***************************************************************************





    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }




    public void updateJob(JobPost jp) {
        repo.updateJob(jp);
    }

    public void delete(int pid) {
        repo.deleteJob(pid);
    }


    public List<JobPost> returnAllJobPosts() {
        return repo.returnAllJobPosts();


    }


    public JobPost getJob(int i) {
        return repo.getJob(i);
    }
}


