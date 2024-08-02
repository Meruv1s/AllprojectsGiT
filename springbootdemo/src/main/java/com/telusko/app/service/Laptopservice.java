package com.telusko.app.service;

import com.telusko.app.model.laptop;
import com.telusko.app.repository.Laptopreopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Laptopservice {
    @Autowired
    private Laptopreopsitory rep;
    public void addlaptopservice(laptop lap) {
     //   System.out.println("method called");
        rep.save(lap);
    }
    public boolean isGoodforprog(laptop lap)

    {
     return true;
    }
}
