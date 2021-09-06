package com.example.crudrefugiosrpingrest.repositories;

import com.example.crudrefugiosrpingrest.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

List<Animal> findAnimalByNombreContaining(String nombre);
Animal findAnimalByColor(String color);
//List<Animal>findAnimalesbyEdadBetween(Integer desde, Integer hasta);

}


