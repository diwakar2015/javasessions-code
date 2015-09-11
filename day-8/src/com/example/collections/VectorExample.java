package com.example.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector list = new Vector();
		
		
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
