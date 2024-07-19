package com.example.dogs.controllers;

import com.example.dogs.models.Dog;
import com.example.dogs.models.TrainedDog;
import com.example.dogs.services.DogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {

    private DogService dogService;

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/{name}")
    public Dog getDogByName(@PathVariable String name) {
        return dogService.getDogByName(name);
    }

    @PostMapping
    public void addDog(@RequestBody Dog dog) {
        dogService.addDog(dog);
    }

    @PostMapping("/train")
    public void addTrainingDog(@RequestBody TrainedDog trainingDog) {
        dogService.addDog(trainingDog);
    }
}
