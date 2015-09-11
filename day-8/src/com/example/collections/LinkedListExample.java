package com.example.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	
	public static void main(String[] args) {
		
		
		
		
		LinkedList list = new LinkedList();
		
		list.add(5);
		list.add(145);
		list.add(4);
		list.add(50);
		list.add(15);
		
		System.out.println("Before sorting...");
		for(Object i : list)
			System.out.print(" "+ i);
		
		
		Collections.sort(list);
		
		
		System.out.println("\nAfter sorting...");
		for(Object i : list)
			System.out.print(" "+ i);
		
		
		
		
		
	}
	
}
