package com.scaleupindia.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.scaleupindia.entity.CustomEmployeeComparator;
import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(20, "Harry"));
		list.add(new Employee(10, "Tom"));
		list.add(new Employee(50, "Dick"));
		
		System.out.println("---DEFAULT---");
		System.out.println("Value of list is: " + list);
		
		System.out.println("---SORT BY ID---");
		Collections.sort(list);
		System.out.println("Value of list is: " + list);
		
		System.out.println("---SORT BY NAME---");
		Collections.sort(list, new CustomEmployeeComparator());
		System.out.println("Value of list is: " + list);
	}
}
