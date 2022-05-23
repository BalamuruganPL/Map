package org.ctrl;

import java.util.*;
import java.util.Map.Entry;

public class Class {
	
	public static void main(String[] args) {
		
		// to declaration of map:
		
		Map<Integer,String> mi = new TreeMap<Integer,String>();
		
		// to add a value in map:
		
		mi.put(25, "Ram");
		mi.put(35, "arun");
		mi.put(45, "Ramesh");
		mi.put(55, "karthick");
		mi.put(65, "Ravi");
		mi.put(75, "Deepak");
		mi.put(85, "Hari");

		// to get size value:
		
		int size = mi.size();
		
		System.out.println(size);
		
		// to print a input:
		
		System.out.println(mi);
		
		//to check if the given key present or not:
		
		boolean con = mi.containsKey(55);
		System.out.println(con);
		
		// to check if the given value present or not:
		
		boolean conV = mi.containsValue("Ram");
		System.out.println(conV);
		
		//to get the value by using key number:
		
		String string = mi.get(55);
		System.out.println(string);
		
		//to get all key value:
		
		Set<Integer> key = mi.keySet();
		System.out.println(key);
	
		// to get all value input:
		
		Collection<String> values = mi.values();
		System.out.println(values);
		
		// to iterate:
		
		Set<Entry<Integer, String>> Rn = mi.entrySet();
		for (Entry<Integer, String> x : Rn) {
			
			System.out.println(x);
//			System.out.println(x.getKey());
//			System.out.println(x.getValue());
		}
	}

}
