package com.tnsif.day6.usingfinal;

public class Finalmethodclass {
	
	Finalmethodclass() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	final void show() {
		System.out.println("Value of a: " + a);
	}

}