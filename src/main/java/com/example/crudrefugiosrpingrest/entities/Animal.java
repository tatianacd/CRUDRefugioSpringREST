package com.example.crudrefugiosrpingrest.entities;

import javax.persistence.*;

@Entity
@Table(name = "animales")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idanimal;
    protected String nombre;
    protected Integer edad;
    protected String color;

    public Animal() {
    }

    public Animal(Integer idanimal, String nombre, Integer edad, String color, Long animal) {
        this.idanimal = idanimal;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idanimal=" + idanimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}
