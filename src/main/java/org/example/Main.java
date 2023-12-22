package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Félix");
        System.out.println(cat);
        cat.makeSound();

        Dog dog = new Dog("Bodri");
        System.out.println(dog);
        dog.makeSound();
    }
}