package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(5);
		list.add(145);
		list.add(4);
		list.add(50);
		list.add(15);
		
		
	/*	list.add("abc");
		list.add("xyz");
		list.add("pqr");
	*/
		
		
		System.out.println("Before sorting...");
		for(Object i : list)
			System.out.print(" "+ i);
		
		
		Collections.sort(list);
		
		
		System.out.println("\nAfter sorting...");
		for(Object i : list)
			System.out.print(" "+ i);
		
		
		
	}

}
