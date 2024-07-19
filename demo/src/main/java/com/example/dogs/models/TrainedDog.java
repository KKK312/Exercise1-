package com.example.dogs.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainedDog extends Dog{
    private String training;

    public TrainedDog(String name, int age, String training) {
        super(name, age);
        this.training = training;
    }


    public void bark() {
        System.out.println(getName() + " голосно гавкає, тому що він тренований.");
    }

    public void performTraining() {
        System.out.println(getName() + " виконує своє тренування: " + training);
    }
}
