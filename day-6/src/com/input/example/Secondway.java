package com.input.example;

import java.util.Scanner;

public class Secondway {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you age ");
		
		int age = sc.nextInt();
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Your name is "+ name + "you age is "+age);
		
		sc.close();
		
	}

}
