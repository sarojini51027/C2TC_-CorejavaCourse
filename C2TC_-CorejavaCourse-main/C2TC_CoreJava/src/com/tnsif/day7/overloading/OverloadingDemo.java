package com.tnsif.day7.overloading;

import java.awt.Point;

public class OverloadingDemo {
	

		public static void main(String[] args) {

			System.out.println("------------------------ Constructor Overloading -----------------------");
			
			Point p = new Point(); //default constructor invoked
			System.out.println(p);

			Point p1 = new Point(); //single parameter constructor
			System.out.println(p1);

			Point p2 = new Point(); //two parameters constructor
			System.out.println(p2);

			System.out.println("------------------------ Method Overloading -----------------------");
			System.out.println("Addition of two integers : " + MethodOverloading.addition(10, 20));
			System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(10.0f, 20.f));
			System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(10, 20.0f));
			System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(10.0f, 20));
			System.out.println("Addition of two Strings : " + MethodOverloading.addition("Hello ", "World"));
		}
	}

