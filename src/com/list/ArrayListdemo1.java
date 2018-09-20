package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListdemo1 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(20);
		l1.add(30);
		l1.add(1,15);
		l1.add(50);
		l1.remove(3);
		Collections.sort(l1);
		System.out.println(l1);
	}
}
