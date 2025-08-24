package com.tnsif.day5.hierarchicalinheritance;

import java.beans.Statement;

import com.tnsif.day3.Person;
import com.tnsif.day4.firstpackage.person;

public class HierarchicalInhDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Employee p;
		p = new Employee();
		if (p instanceof Employee)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Employee();
		if (p instanceof Employee)
			System.out.println("Student Details "+p);

	}

}

