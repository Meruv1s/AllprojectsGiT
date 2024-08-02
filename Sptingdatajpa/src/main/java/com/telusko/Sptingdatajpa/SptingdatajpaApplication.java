package com.telusko.Sptingdatajpa;

import com.telusko.Sptingdatajpa.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SptingdatajpaApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(SptingdatajpaApplication.class, args);
	StudentRepo repo= context.getBean(StudentRepo.class);
		Student s1= context.getBean(Student.class);
		Student s2= context.getBean(Student.class);
		Student s3= context.getBean(Student.class);
		s1.setName("navinreddy");
		s1.setMarks(75);
		s1.setRollno(10);

		s2.setName("navin taireddy");
		s2.setMarks(65);
		s2.setRollno(104);

		s3.setName("navin");
		s3.setMarks(75);
		s3.setRollno(103);

		//repo.save(s2);
	System.out.println(repo.findAll()); // find all records from data bade
		//System.out.println(repo.findById(102));
	//Optional<Student> s= repo.findById(102);// another ways for find by Id
	//System.out.println(s.orElse(new Student()));// if 102 is not there it returns student object with blank values
	//System.out.println(	repo.findByName("navin"));
	//System.out.println(repo.findByMarks(75));
		//System.out.println(repo.findByMarksGreaterThan(72)); //query Dsl
	//	repo.save(s2);// for update operation
		//repo.delete(s2);

	}

}
