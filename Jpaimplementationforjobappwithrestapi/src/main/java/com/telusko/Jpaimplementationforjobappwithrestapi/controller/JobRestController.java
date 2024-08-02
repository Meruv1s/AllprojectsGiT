package com.telusko.Jpaimplementationforjobappwithrestapi.controller;

import com.telusko.Jpaimplementationforjobappwithrestapi.model.JobPost;
import com.telusko.Jpaimplementationforjobappwithrestapi.model.JobPost;
import com.telusko.Jpaimplementationforjobappwithrestapi.service.JobService;
import com.telusko.Jpaimplementationforjobappwithrestapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// use restcontroller and remove ResponseBody for methods instead of Controller if we are dealing with json data not with jsp pages
@CrossOrigin(origins ="http://localhost:3000") //Its for security which makes fornt end react to run withouterrors
public class JobRestController {
     @Autowired
    private JobService service;

     @GetMapping("jobPosts")
  //  @ResponseBody  // we are conveying spring that dont search for view page its json data
    public List<JobPost>  getAllJobs()
    {
        return service.returnAllJobPosts();
    }

    @GetMapping("jobPost/{id}")// "jobPost/{id}/{something}"
   public JobPost getJob(@PathVariable("id") int id)
   {
return service.getJob(id);
   }
   @PostMapping("jobPost")
   public void addjob(@RequestBody JobPost jp)
   {
   service.addJobPost(jp);
   }
  @PutMapping("jobPost")
   public JobPost updateJob(@RequestBody  JobPost jp)
   {
      service.updateJob(jp);
      return service.getJob(jp.getPostId());
   }
   @DeleteMapping("jobPost/{pid}")
   public String deleteJob(@PathVariable int pid)
   {
service.delete(pid);
return "deleted";
   }
   @GetMapping("load")
   public String loadData()
   {
   service.load();
  return "success";
   }
   @GetMapping("jobPosts/keyword/{keyword}")
  public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword)
  {
 return service.search(keyword);
  }
}

