package org.example;

public class Cat extends Animal{

    //empty Constructor
    public Cat() {}

    //constructor
    public Cat(String name) {
        super(name);
    }

    //toString
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("A macska nyávog");
    }
}
