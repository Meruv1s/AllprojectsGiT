package com.telusko.spring_boot_rest.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
public class JobPost {

   public JobPost()
   {

     System.out.println("Jobpost cons");
   }

  public List<String> getPostTechStack() {
    return postTechStack;
  }

  public void setPostTechStack(List<String> postTechStack) {
    this.postTechStack = postTechStack;
  }

  public Integer getReqExperience() {
    return reqExperience;
  }

  public void setReqExperience(Integer reqExperience) {
    this.reqExperience = reqExperience;
  }

  public String getPostDesc() {
    return postDesc;
  }

  public void setPostDesc(String postDesc) {
    this.postDesc = postDesc;
  }

  public String getPostProfile() {
    return postProfile;
  }

  public void setPostProfile(String postProfile) {
    this.postProfile = postProfile;
  }

  public int getPostId() {
    return postId;
  }

  public void setPostId(int postId) {
    this.postId = postId;
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