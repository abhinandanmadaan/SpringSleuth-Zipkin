package com.springsleuth.demo.controller;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String [] args) {
		
		HashMap<Integer, String> mapOne = new HashMap<>();
		
		Map<Integer, String> mapTwo = new HashMap<Integer, String>();
		
		
		//put(k,v) 
		
		mapOne.put(1, "One");
		mapOne.put(2, "Two");
		mapOne.put(3, "Three");
		mapOne.put(4, "Four");
		mapOne.put(5, "Five");
		mapOne.put(6, "Six");
		
		System.out.println(mapOne);
		
		mapTwo.put(7, "Seven");
		mapTwo.put(8, "Eight");
		mapTwo.put(9, "Nine");
		mapTwo.put(10, "Ten");
		
		System.out.println(mapTwo);
		
		//get(k)
		
		System.out.println("Value of key 5: "+mapOne.get(5));
		System.out.println("Value of key 25: "+mapOne.get(25));
		
		//containKey(k)
		
		System.out.println("is Key 5 prensent: "+mapOne.containsKey(5));
		System.out.println("is Key 25 prensent: "+mapOne.containsKey(25));
		
		//remove(k)
		
		mapOne.remove(5);
		
		System.out.println(mapOne);
		
		//clear()
		
		mapOne.clear();
		System.out.println(mapOne);
		
		//size()
		
		System.out.println("size of mapTwo: "+mapTwo.size());
	}

}
