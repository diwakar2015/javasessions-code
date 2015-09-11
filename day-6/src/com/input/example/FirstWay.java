package com.input.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstWay {
	
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		
		
		BufferedReader br = new BufferedReader(ir);	
		
		System.out.println("Enter your age");
		
		String input = br.readLine();
		
		int age = Integer.parseInt(input);
		System.out.println("Your age is : "+ age);
		
		if(age> 18)
		{
			System.out.println("You can cast your vote");
		}
		
		else
			
		{
			System.out.println("You can not cast");
		}
		
		
	}
	

}
