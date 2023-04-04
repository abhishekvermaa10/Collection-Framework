package com.scaleupindia.example6;

import java.util.Set;
import java.util.TreeSet;

import com.scaleupindia.entity.CustomEmployeeComparator;
import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(20, "Harry"));
		set.add(new Employee(10, "Tom"));
		set.add(new Employee(50, "Dick"));

		System.out.println("---DEFAULT---");
		System.out.println("Value of set is: " + set);

		System.out.println("---SORT BY NAME---");
		Set<Employee> set2 = new TreeSet<>(new CustomEmployeeComparator());
		set2.add(new Employee(20, "Harry"));
		set2.add(new Employee(10, "Tom"));
		set2.add(new Employee(50, "Dick"));
		System.out.println("Value of set is: " + set2);
	}
}
