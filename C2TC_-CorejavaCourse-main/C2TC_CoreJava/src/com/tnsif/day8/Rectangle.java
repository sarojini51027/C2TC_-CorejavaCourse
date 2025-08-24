package com.tnsif.day8;

public class Rectangle {
	
	public class Rectangle extends Shape{
		private float width, height;

		public Rectangle() {
			this.width = 5.0f;
			this.height = 2.0f;
		}

		public Rectangle(float width, float height) {
			this.width = width;
			this.height = height;
		}

		@Override
		void calArea() {
			area=width*height;		
		}
		

	}

	public void calArea() {
		// TODO Auto-generated method stub
		
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}

