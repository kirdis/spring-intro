package com.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String name;
    private String surname;
    private int age;

/*    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
