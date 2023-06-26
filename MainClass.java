package com.project;

public class MainClass 
{
	   public static void main(String[] args) 
	   {
	        Zoo z = new Zoo();

	        // Add animals to the zoo
	        z.addAnimal(new Lion("Simba", 4));
	        z.addAnimal(new Tiger("Bruce", 8));
	        z.addAnimal(new Elephant("Jumbo", 9));

	        // List all animals in the zoo
	        z.listAnimals();

	        // Interact with animals
	        z.interactWithAnimals();
	    }
}
