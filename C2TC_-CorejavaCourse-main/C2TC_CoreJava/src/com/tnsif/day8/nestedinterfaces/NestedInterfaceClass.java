package com.tnsif.day8.nestedinterfaces;

public class NestedInterfaceClass {
	
	public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

		@Override
		public void print() {
			// TODO Auto-generated method stub
			 System.out.println("Print method of nested interface");
		}

		

	}
}
