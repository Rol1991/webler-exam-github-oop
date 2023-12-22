package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Félix");
        System.out.println(cat);
        cat.makeSound();

        Dog dog = new Dog("Bodri");
        System.out.println(dog);
        dog.makeSound();

        Cat cat1 = new Cat("Mirr-Murr");
        System.out.println(cat1);
        cat1.makeSound();

        Dog dog1 = new Dog("Snoopy");
        System.out.println(dog1);
        dog1.makeSound();
    }
}