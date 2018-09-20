package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Frans", "Frans@gamil.com"));
		list.add(new Employee(101, "Frans", "Frans@gamil.com"));
		list.add(new Employee(103, "Christine", "Chiristine@gamil.com"));
		list.add(new Employee(103, "Srav", "Srav@gamil.com"));
		list.add(new Employee(109, "Madhu", "Madhu@gamil.com"));
		list.add(new Employee(104, "Sam", "sam@gamil.com"));
		list.add(new Employee(107, "ram", "ram@gamil.com"));
		Collections.sort(list,new NameComparator());
	//	Collections.sort(list, new NameComparator());
		System.out.println(list);

	}
}
