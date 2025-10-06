package org.basic.conditions;

public class ConditionsMethods 
{
	public void swapValuewithVariable(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	
	public void swapValueUsingThirdVariable(int a, int b)
	{
		int c=a;
		a=b;
		b=c;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}

}
