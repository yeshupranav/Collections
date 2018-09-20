package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//insertion order maintained & duplicates are allowed;
public class ArrayListDemo {
	public static void main(String[] args) {
		/*List<Integer> l = new ArrayList<Integer>();
		l.add(19);
		l.add(20);
		l.add(35);
		l.add(20);
		System.out.println(l);*/
		
		List<String> st= new ArrayList<String>();
		st.add("yellow");
		st.add("Blue");
		st.add("red");
		st.add("Brown");
		st.add("orange");
		st.add("orange");
		//Traditional for loop;
/*		for(int i =0;i<st.size();i++) {
			System.out.println(st.get(i)+" ");
		}
		//foreach loop
		for (String string : st) {
			System.out.println(string);
		}
*/		//Iterator
		Iterator it = st.iterator();
		while(it.hasNext()) {
	   System.out.println(it.next());	
		Collections.sort(st);
		System.out.println(st);
		}
	}

}
