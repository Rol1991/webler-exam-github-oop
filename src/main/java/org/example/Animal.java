package org.example;

public class Animal {

    public String name;

    //Empty constructor for Spring
    public Animal() {
    }

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //toString

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }


    //Method for the child classes to implement
    public void makeSound() {}
}
