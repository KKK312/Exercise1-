package com.example.dogs.services;

import com.example.dogs.models.Dog;
import com.example.dogs.models.TrainedDog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DogService {
    private List<Dog> dogs = new ArrayList<>();

    public DogService() {
        dogs.add(new Dog("Жужа", 3));
        dogs.add(new TrainedDog("Рекс", 5, "Сидіти"));
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public Dog getDogByName(String name) {
        return dogs.stream().filter(d -> d.getName().equals(name)).findFirst().orElse(null);
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }
}
