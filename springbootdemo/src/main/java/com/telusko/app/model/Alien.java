package com.telusko.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {


   public Alien()
   {
       System.out.println("Alien cons");
   }
    private int age;
    public int getAge() {
        return age;
    }
    @Value("24")
    public void setAge(int age) {
        System.out.println("Age Setter");
        this.age = age;
    }


    public Computer getCom() {
      return com;
    }
   @Autowired
  @Qualifier("laptop")
   public void setCom(Computer com) {
      System.out.println("comp obj assigned");
      this.com = com;
   }

   @Autowired
   laptop lap;
   private Computer com;

    public void code()
    {
com.compile();
lap.compile();

    }
}
