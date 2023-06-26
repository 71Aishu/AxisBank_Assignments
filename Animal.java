package com.project;

abstract class Animal 
{
     String name;
     int age;

    public Animal(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void showInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
