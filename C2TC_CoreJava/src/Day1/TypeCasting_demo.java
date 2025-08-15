package Day1;

public class TypeCasting_demo {
	
	public static void main(String[] args) {
	
		byte b = 6; 
		int i = b; //4 bytes
		System.out.println(i);
		
		float f = 25.54f;
		double d = f;		
		System.out.println(d);
		
		char ch = 'A';	
		int i3 = ch;
		System.out.println(i3);
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println(i4);
		

		double f1 = 10.52f;	
		long l = (long) f1;
		System.out.println(l);

		long l1 = 923372036854775806l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 34.96f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 60;
		char ch1 = (char) b1;
		System.out.println(ch1);
		
	}	

}
