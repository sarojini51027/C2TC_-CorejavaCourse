package Day2;

public class Operators {
     public static void main(String[] args) {
	        int a = 10, b = 5;

	        System.out.println("Arithmetic (a + b): " + (a + b));

	        System.out.println("Relational (a > b): " + (a > b));

	        boolean x = true, y = false;
	        System.out.println("Logical (x && y): " + (x && y));

	        int c = a; 
	        System.out.println("Assignment (c = a): " + c);

	        a++; 
	        System.out.println("Increment (a++): " + a);

	        int max = (a > b) ? a : b;
	        System.out.println("Ternary (max of a and b): " + max);

	    }
}
