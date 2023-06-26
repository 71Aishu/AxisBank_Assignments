package com.axis_program;

public class MethodOverloading 
{

	public void mul(int a, int b)
	{
		System.out.println("The multiplication Between numbers is : "+ a*b);
	}
	public void mul(int a, int b,int c)
	{
		System.out.println("The multiplication Between numbers is : "+ a*b*c);
	}
	public void div(int a, int b)
	{
		System.out.println("The Division Between numbers is : "+ a/b);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverloading md = new MethodOverloading ();
		md.mul(30, 45);
		md.mul(67, 3, 89);
		md.div(45, 9);

	}

}
