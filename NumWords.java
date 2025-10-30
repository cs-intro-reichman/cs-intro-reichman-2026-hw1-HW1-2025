// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int inputNumber = Integer.parseInt (args[0]);
		int hundreds = inputNumber / 100;
		int tens = (inputNumber / 10) % 10;
		int ones = inputNumber % 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
