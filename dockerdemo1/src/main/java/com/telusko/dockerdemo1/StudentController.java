package com.telusko.dockerdemo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo rep;
   @RequestMapping("/getstudents")
    public List<Student> getStudnets()
    {

  //      return List.of(new Student("sumanth",1,21),new Student("sachin",2,21),new Student("dhoni",3,71));
   return rep.findAll();
    }
@RequestMapping("addstudent")
    public void addStudent()
    {
   Student s = new Student();
   s.setAge(20);
   s.setName("harsh");
   s.setId(67);
   rep.save(s);
    }

}
