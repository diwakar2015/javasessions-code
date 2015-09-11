package com.example.main.app;

import com.xyz.sample.project.PrimeCheckHelper;

public class PrimePrinter {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++)
		{
			
			boolean isPrime = PrimeCheckHelper.isPrime(i);
			if(isPrime == true)
			{
				System.out.println(" "+ i + " is a prime number");
			}
			
		}
		
		
	}

}
