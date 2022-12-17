package com.spring_introduction;

public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void say() {
        System.out.println("wow-wow");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy");
    }
}
