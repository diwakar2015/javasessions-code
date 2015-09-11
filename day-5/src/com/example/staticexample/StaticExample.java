package com.example.staticexample;

import com.xyz.sample.project.PrimeCheckHelper;

public final class StaticExample {
	
	final static String SSN = "124-568-986";
	
	  
	
	public static void main(String[] args) {
		
	// No need to create an object to access the SSN	
	System.out.println(SSN);
	
	// No need to create and Objec to call a static method
	boolean isPrime = PrimeCheckHelper.isPrime(5);	
	System.out.println(isPrime);
	    
	   

		
	}

}
