// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int num1 = (int) ((Math.random() * range) + 1);
		int num2 = (int) ((Math.random() * range) + 1);
		int num3 = (int) ((Math.random() * range) + 1);

		int small = Math.min(num1, Math.min(num2, num3));
		int biggie = Math.max(num1, Math.max(num2, num3));
		int middle = (num1 + num2 + num3) - small - biggie;

		System.out.println("Your numbers are: " + small + "," + middle + "," + biggie);

	}
}
