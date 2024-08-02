package com.sumanth.SpringJdbc.service;

import com.sumanth.SpringJdbc.Model.Student;
import com.sumanth.SpringJdbc.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
   @Autowired
   private Studentrepo rep;
    public void addstudent(Student s) {

             rep.save(s);
    }

    public List<Student> getStudents() {
        return rep.findall();
    }
}
