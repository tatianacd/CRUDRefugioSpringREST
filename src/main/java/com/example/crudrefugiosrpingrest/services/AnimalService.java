package com.example.crudrefugiosrpingrest.services;

import com.example.crudrefugiosrpingrest.entities.Animal;
import com.example.crudrefugiosrpingrest.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> findAllAnimals(){
        return animalRepository.findAll();
    }

    public List<Animal> findAnimalByNombreContaining(String nombre){
        return animalRepository.findAnimalByNombreContaining(nombre);
    }

    public Animal findAnimalByColor(String color){
        return animalRepository.findAnimalByColor(color);

    }

   /* public List<Animal>findAnimalByEdadBetween(String desde, String hasta){
       Integer edadDesdeInt = 0;
       Integer edadHastaInt = 0;
       try{
           if(edadDesdeInt != null)edadDesdeInt = Integer.valueOf(desde);
           if(edadHastaInt != null)edadHastaInt = Integer.valueOf(hasta);
       }catch (NumberFormatException e){
           e.printStackTrace();
       }
       return animalRepository.findAnimalesbyEdadBetween(edadDesdeInt,edadHastaInt);
    }*/

    public List<Animal> getAnimalByIdanimal(String idAnimal) {
        Integer id;
        try{
            id = Integer.parseInt(idAnimal);
        }catch (NumberFormatException e){
            id = 0;
        }
        return animalRepository.findAllById(List.of(id));
    }

    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }


}
