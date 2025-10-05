package org.basic.conditions;

import java.util.Scanner;

public class SwapValueWithoutThirdVariable
{
	public static void main(String[] args) 
	{
		ConditionsMethods conditions = new ConditionsMethods();
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the value for a");
		int a = input.nextInt();
		System.out.println("Please Enter the value for b");
		int b = input.nextInt();
		conditions.swapValuewithVariable(a, b);
		
	}

}
