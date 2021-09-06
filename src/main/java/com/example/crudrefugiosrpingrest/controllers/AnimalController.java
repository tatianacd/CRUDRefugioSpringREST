package com.example.crudrefugiosrpingrest.controllers;

import com.example.crudrefugiosrpingrest.entities.Animal;
import com.example.crudrefugiosrpingrest.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animales")
public class AnimalController {

    private final AnimalService animalService;
    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping()
    public List<Animal> findAllAnimals(){
        return animalService.findAllAnimals();
    }

    @GetMapping("nombre/{nombre}")
    public List<Animal> findAnimalByNombreContaining(@PathVariable String nombre){
        return animalService.findAnimalByNombreContaining(nombre);
    }

    @GetMapping("/color/{color}")
    public Animal findAnimalByColor(@PathVariable String color){
        return animalService.findAnimalByColor(color);
    }

    /*@GetMapping("edad/{desde}/{hasta}")
    public List<Animal>findAnimalByEdadBetween(@PathVariable String desde, @PathVariable String hasta){
        return animalService.findAnimalByEdadBetween(desde,hasta);
    }*/
    @GetMapping("id/{id}")
     public List<Animal> getById(@PathVariable String id){
        return animalService.getAnimalByIdanimal(id);

     }

    @PostMapping()
    public Animal crear(@RequestBody Animal animal){
        animalService.save(animal);
        return animal;
    }
}
