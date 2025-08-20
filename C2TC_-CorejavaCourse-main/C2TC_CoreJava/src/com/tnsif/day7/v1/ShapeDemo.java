package com.tnsif.day7.v1;

public class ShapeDemo {
	
	
		public static void main(String[] args) {
			// Create an array of Shape objects
			Shape[] shapes = new Shape[3];

			// Instantiate objects of Circle, Triangle, and Square
			shapes[0] = new Shape();
			shapes[1] = new Shape();
			shapes[2] = new Shape();

			// Demonstrate polymorphism by calling draw and erase methods
			for (Shape shape : shapes) {
				shape.draw();
				shape.erase();
				System.out.println("----------------------"); 
			}
		
	}
}
