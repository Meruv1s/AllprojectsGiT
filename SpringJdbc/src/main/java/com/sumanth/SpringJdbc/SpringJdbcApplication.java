package com.sumanth.SpringJdbc;

import com.sumanth.SpringJdbc.Model.Student;
import com.sumanth.SpringJdbc.service.Studentservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

	ApplicationContext context= SpringApplication.run(SpringJdbcApplication.class, args);
		System.out.println("Hello world");
		Student s= context.getBean(Student.class);
		s.setMarks(20);
		s.setName("Rohit");
		s.setRollno(4);

		Studentservice service= context.getBean(Studentservice.class);
		//service.addstudent(s);

		List<Student> students= service.getStudents();
		System.out.println(students);
	}

}
