package com.example.javaproject2.week6.day5;

import org.w3c.dom.ls.LSOutput;

abstract class Animal {
    public abstract void makeSound();

    public void eat(){
        System.out.println("와구와구");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("왈왈");

    }
}

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
