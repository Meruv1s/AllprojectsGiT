package com.telusko.JobApp.model;


import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
public class JobPost {

   public JobPost()
   {

     System.out.println("Jobpost cons");
   }

  private int postId;
  private String postProfile;
  private String postDesc;
  private Integer reqExperience;
  private List<String> postTechStack;

  public JobPost(int postId,  String postProfile,String postDesc, Integer reqExperience, List<String> postTechStack) {
    this.postId = postId;
    this.postTechStack = postTechStack;
    this.reqExperience = reqExperience;
    this.postDesc = postDesc;
    this.postProfile = postProfile;
  }

  @Override
  public String toString() {
    return "JobPost{" +
            "postId=" + postId +
            ", postProfile='" + postProfile + '\'' +
            ", postDesc='" + postDesc + '\'' +
            ", reqExperience=" + reqExperience +
            ", postTechStack=" + postTechStack +
            '}';
  }
}