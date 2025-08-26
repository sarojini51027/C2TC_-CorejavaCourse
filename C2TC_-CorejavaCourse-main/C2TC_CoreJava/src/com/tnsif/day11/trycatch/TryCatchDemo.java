package com.tnsif.day11.trycatch;

public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("I am in main method"); 
		int result;
		
		result=TryCatchDemo.performDivision(12,0);
		if (result!=0)
			System.out.println("Diviosin is "+result);
		
		System.out.println("------------------------------");
		
		result=TryCatchDemo.performDivision(12,3);
		if (result!=0)
			System.out.println("Division is "+result);
		
		System.out.println("------------------------------");
		System.out.println(TryCatchDemo.performDivision(12f, 5f));
		
		System.out.println("------------------------------");
		System.out.println(TryCatchDemo.performDivision(12f, 0f));
		
	}

	private static int performDivision(float f, float g) {
		// TODO Auto-generated method stub
		return 0;
	}
}

