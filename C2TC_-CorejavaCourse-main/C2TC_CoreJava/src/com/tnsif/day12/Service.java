package com.tnsif.day12;

import javax.management.InvalidApplicationException;

public class Service {
	public static boolean validateMarks(int[] marks) throws InvalidApplicationException {
		for(int ele:marks)
		{
			if (ele<0 || ele>100)
				throw new InvalidApplicationException("Marks should be between 0 to 100");
		}
		return true;
		
	}
	public static float calculatePercentage(int[] marks)
	{
		int total=0;
		for(int value:marks)
			total+=value;
		float per=total/marks.length;
		return per;
		
	}

}

