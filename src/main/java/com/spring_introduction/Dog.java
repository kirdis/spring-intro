package com.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void say() {
        System.out.println("wow-wow");
    }

/*    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy");
    }*/
}
