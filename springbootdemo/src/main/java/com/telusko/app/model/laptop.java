package com.telusko.app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class laptop implements Computer
{
    public laptop() {
        System.out.println("laptop cons");
    }

    public  void compile()
    {
System.out.println("compiling in LAp");
    }
}
