package com.tnsif.day7.overriding;

import day7.Overriding.HDFC;
import day7.Overriding.RBI;

public class OverridingDemo {
	
	public static void main(String[] args) {
		RBI rbi;


		rbi = new RBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICIC();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}