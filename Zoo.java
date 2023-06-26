package com.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Zoo
{
    private List<Animal> animals;

    public Zoo() 
    {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) 
    {
        animals.add(animal);
    }

    public void listAnimals() 
    {
        for (Animal animal : animals)
        {
            animal.showInfo();
        }
    }

    public void interactWithAnimals() 
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) 
        {
            System.out.println("Enter the name of an animal to make a sound (or 'quit' to exit):");
            input = scanner.nextLine();

            if (!input.equals("quit"))
            {
                boolean animalFound = false;

                for (Animal animal : animals) 
                {
                    if (animal.name.equalsIgnoreCase(input)) 
                    {
                        animal.makeSound();
                        animalFound = true;
                        break;
                    }
                }

                if (!animalFound) 
                {
                    System.out.println("Animal not found.");
                }
            }
        }
    }
}
