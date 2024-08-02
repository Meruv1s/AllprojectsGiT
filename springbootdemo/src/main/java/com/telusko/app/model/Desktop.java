package com.telusko.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public Desktop() {

        System.out.println("desktop object");
    }

    public  void compile()
    {
        System.out.println("compiling in Desttop");
    }
}
