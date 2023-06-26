package com.project;

class Tiger extends Animal 
{
    public Tiger(String name, int age) 
    {
        super(name, age);
    }

    @Override
    public void makeSound() 
    {
        System.out.println("The tiger growls.");
    }
}
