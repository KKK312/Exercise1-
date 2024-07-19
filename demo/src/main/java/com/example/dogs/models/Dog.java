package com.example.dogs.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " гавкає.");
    }
}
