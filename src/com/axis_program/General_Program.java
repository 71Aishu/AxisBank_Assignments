package com.axis_program;
import java.util.Scanner;

public class General_Program {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		int a = 71;
		double d = 3.2d;
		float f = 4.3f;
		String s = "Aishwarya";
		
	  System.out.println("Veriables are printed");
	  System.out.println(a);
	  System.out.println(d);
	  System.out.println(f);
	  System.out.println(s);
	  
	  System.out.println("******************************************");
	  
	  // verify the person is indian citizen , then only will be vote
	  
	  String ind = "Indian";
	  System.out.println("Enter the country name : ");
	  String isIndian = sc.nextLine();
	  int age = 22;
	  
	  if(ind.equalsIgnoreCase(isIndian) && age >= 18)
	  {
		System.out.println("Its eligiable");  
	  }
	  else
	  {
		  System.out.println("Not eligiable");
	  }
	  
	  System.out.println(" For Loop ******************************************");
	  
	  // print the name 10 times
	  
	  int b = 0;
	  int c = 1 ;
	  
	  for(int i = 0;i<=10;i++)
	  {
		  System.out.println("Aishwarya Viptal");
	  }
	  System.out.println(" While Loop ******************************************");
	  
	  while (b <= 10)
	  {
		  System.out.println("Aishwarya Viptal");
		  b++;
	  }
	  System.out.println(" Do While Loop ******************************************");
	  
	  do
	  {
		  System.out.println("Aishwarya Viptal");
		  c++;
	  }while (c <= 10);
	}

}
