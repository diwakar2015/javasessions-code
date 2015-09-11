package com.xyz.sample.project;


public class PrimeCheckHelper {
	
	public static boolean isPrime(int number)
	{
		boolean isPrime = true;
		
		for(int i = 2 ; i< number ; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
		
	}

}
