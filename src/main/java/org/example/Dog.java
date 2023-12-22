package org.example;

public class Dog extends Animal{

    //Empty constructor
    public Dog() {}

    //Constructor
    public Dog(String name) {
        super(name);
    }

    //toString
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void makeSound() {
        System.out.println("A kutya ugat");
    }
}
