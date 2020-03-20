package org;

public class simple {
	public int principal;
	public int rate;
	public int time;
	public float interest;
	
	public void calculateinterest() 
	{
		interest=principal*rate*time/100;
		System.out.println("The calculated value is"+interest);
	}

	
		// TODO Auto-generated method stub
	public void display()
	{
		System.out.println("This program calculates simpleinterest");
		calculateinterest();
	}
		
	}
		
	

