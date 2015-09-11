package com.example.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> itemList = new HashMap<String,Integer>();
		
		itemList.put("Milk", 5);
		itemList.put("juice", 2);
		itemList.put("pen", 50);
		
		
		System.out.println("pen unit "+ itemList.get("pen"));
		
		
		
		for(Map.Entry<String, Integer> entry : itemList.entrySet())
		{
			System.out.println("Item : "+ entry.getKey() + " Unit: "+ entry.getValue());
			System.out.println();
		}
			
		
	}
	
	

}
