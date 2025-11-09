// Generates three integer random numbers in a given range,
// and prints them in increasing order.

/*

feedback:

 - Good work! - 

*/

public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		double a = Math.random() * lim;
		double b = Math.random() * lim;
		double c = Math.random() * lim;

		double minimum = Math.min(a, b);
		minimum = Math.min(minimum, c);
		double maximum = Math.max(a, b);
		maximum = Math.max(maximum, c);
		double middle = Math.min(Math.max(a, b), Math.max(b, c));
		middle = Math.min(middle, Math.max(a, c));

		// double middle = Math.
		System.out.println((int) a + " " + (int) b + " " + (int) c);
		System.out.println((int) minimum + " " + (int) middle + " " + (int) maximum);
	}
}

