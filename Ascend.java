
import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		// Draw of 3 random numbers in the range
		int a = (int)(Math.random() * lim + 1);	
		int b = (int)(Math.random() * lim + 1);	
		int c = (int)(Math.random() * lim + 1);	
		// Printing the numbers
		System.out.println(a +" " + b + " " + c);
		
		// Arrange the numbers from smallest to largest and print them
		int smallest = Math.min(Math.min(a,b), c);
		int biggest = Math.max(Math.max(a,b), c);
		int middle = a + b + c - (smallest + biggest);
		System.out.println(smallest + " " + middle + " " + biggest);
		
	}
}
