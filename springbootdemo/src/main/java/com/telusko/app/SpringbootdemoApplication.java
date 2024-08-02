package com.telusko.app;

import com.telusko.app.model.Alien;
import com.telusko.app.model.laptop;
import com.telusko.app.service.Laptopservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(SpringbootdemoApplication.class, args);
		System.out.println("coding");

	//	Alien obj= new Alien();
		Alien obj= context.getBean(Alien.class);// hey container get obh ie get bean
		obj.code();
	//	Alien obj1= context.getBean(Alien.class);// hey container get obh ie get bean
	//	obj1.code();

		// laptop service class

    Laptopservice service= context.getBean(Laptopservice.class);

		 laptop lap = context.getBean(laptop.class);
		 service.addlaptopservice(lap);
	}

}

