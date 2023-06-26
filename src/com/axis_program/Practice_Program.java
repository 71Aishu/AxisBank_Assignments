package com.axis_program;
import java.util.Scanner;

public class Practice_Program {

	public static void main(String[] args) 
	{
		//  How can i validate whether the child is eligible for play school or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int child = sc.nextInt();
		if (child >= 3)
		{
			System.out.println("Child is eligiable for play school");
		}
		else 
		{
			System.out.println("Child is not eligiable for play school");	
		}
    System.out.println("***********************************************************");
    
    // Use for Loop and print value of variable "a" whose value is 5 . And print the same 20 times.
    int a =5;
    for (int i = 0; i<=20; i++)
    {
    	System.out.println(a);
    }
    
    System.out.println("***********************************************************");

    // I need to print "Shilpa" atleast once , using either for  or while or do while loop ?
    
    int s = 0;
    do
    {
    	System.out.println("Shilpa");
    	s++;
    } while (s >= 3);
    
    System.out.println("***********************************************************");

    /* Use the IF condition to cater the following question (if else ladder or multiple if else )

 

A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 46 to 50 - D
d. 51 to 60 - C
e. 61 to 80 - B
f. Above 80 - A
 */
    
    System.out.println("Enter the Marks : ");
    int marks = sc.nextInt();
    
    if(marks < 25)
    {
    	System.out.println("F");
    }
     else if (marks <= 25 || marks >=45)
    {
    	System.out.println("E");
    }
     else if (marks <= 46 || marks >=50)
     {
     	System.out.println("D");
     }
     else if (marks <= 51 || marks >=60)
     {
     	System.out.println("C");
     }
     else if (marks <= 61 || marks >=80)
     {
     	System.out.println("B");
     }
     else if (marks >= 80)
     {
     	System.out.println("A");
     }
     else
     {
    	 System.out.println("Invalid");
     }
	}

}
