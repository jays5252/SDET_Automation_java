package org.basic.java;

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		AirthMeticMethods arth = new AirthMeticMethods();
		System.out.println("Please enter the value for x1");
		int x1 = input.nextInt();
		System.out.println("Please enter the value for x2");
		int x2 = input.nextInt();
		System.out.println("Please enter the value for x3");
		int x3 = input.nextInt();
		System.out.println("Please enter the value for x4");
		int x4 = input.nextInt();
		System.out.println("Please enter the value for x5");
		int x5 = input.nextInt();
		System.out.println("Please enter the value for x6");
		int x6 = input.nextInt();
		
		int multi = arth.Multi(x1, x2);
		int multiResult = arth.Multi(multi, x3);
		int subResult = arth.Sub(multiResult, x4);
		int sumResult = arth.Sum(subResult, x5);
		int finalResilt = arth.Div(sumResult, x6);
		
		System.out.println("Final Result: "+finalResilt);	
		
	}

}
