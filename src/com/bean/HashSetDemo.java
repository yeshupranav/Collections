package com.bean;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();
		hashset.add("value1");
		hashset.add("value2");
		hashset.add("value3");
		hashset.add("value4");
		hashset.add("value4");
		
		System.out.println(hashset.size());

		for (String value : hashset) {
			System.out.println(value);
		}
		
		
	}

}
