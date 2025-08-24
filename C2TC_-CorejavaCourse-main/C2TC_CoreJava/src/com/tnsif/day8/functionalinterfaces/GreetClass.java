package com.tnsif.day8.functionalinterfaces;

public class GreetClass {
	

	public class GreetClass implements GreetInterface {

		@Override
		public String greet() {		
			return "Welcome to the world of Java";
		}

	}
}
