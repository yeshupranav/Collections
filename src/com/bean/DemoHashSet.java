package com.bean;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(9);
		h.add(null);
		h.add(19);
		System.out.println(h.add(5));
		System.out.println(h);
	}

}
