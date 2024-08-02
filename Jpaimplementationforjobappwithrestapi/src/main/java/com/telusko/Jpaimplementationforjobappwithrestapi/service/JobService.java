
package com.telusko.Jpaimplementationforjobappwithrestapi.service;

import com.telusko.Jpaimplementationforjobappwithrestapi.model.JobPost;
import com.telusko.Jpaimplementationforjobappwithrestapi.model.JobPost;
import com.telusko.Jpaimplementationforjobappwithrestapi.repo.JobRepo;
import com.telusko.Jpaimplementationforjobappwithrestapi.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;



    //method to return all JobPosts






    // ***************************************************************************





    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.save(jobPost);

    }




    public void updateJob(JobPost jp) {
        repo.save(jp);
    }

    public void delete(int pid) {
        repo.deleteById(pid);
    }


    public List<JobPost> returnAllJobPosts() {
        return repo.findAll();


    }


    public JobPost getJob(int i) {
        return repo.findById(i).orElse(new JobPost());
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(List.of(
                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                        List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
                new JobPost(2, "Python Developer", "Must have good experience in Python and Django", 3,
                        List.of("Python", "Django", "Flask", "REST APIs")),
                new JobPost(3, "Front End Developer", "Must have good experience in HTML, CSS, and JavaScript", 2,
                        List.of("HTML", "CSS", "JavaScript", "React")),
                new JobPost(4, "Data Scientist", "Must have good experience in data analysis and machine learning", 4,
                        List.of("Python", "Machine Learning", "Data Analysis", "Pandas")),
                new JobPost(6, "DevOps Engineer", "Must have good experience in CI/CD and cloud infrastructure", 3,
                        List.of("CI/CD", "Docker", "Kubernetes", "AWS"))
        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
      return   repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}


