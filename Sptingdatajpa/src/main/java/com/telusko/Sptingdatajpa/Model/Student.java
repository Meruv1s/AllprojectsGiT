package com.telusko.Sptingdatajpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity // which will tell spring Jpa to create a table for this
public class Student {

    public Student() {
        System.out.println("Studen cons");
    }
    @Id // it makes rollno as primaary key
    private int rollno;
    private  int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
