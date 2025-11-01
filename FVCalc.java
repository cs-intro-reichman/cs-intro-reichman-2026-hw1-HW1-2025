// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		// 𝑓𝑢𝑡𝑢𝑟𝑒𝑉𝑎𝑙𝑢𝑒 = 𝑐𝑢𝑟𝑟𝑒𝑛𝑡𝑉𝑎𝑙𝑢𝑒 ⋅ (1 + 𝑟𝑎𝑡𝑒)!
		double currentValue = Double.parseDouble(args[0]);
		int rate = Integer.parseInt(args[1]);
		int yearsN = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate / 100), yearsN);
		futureValue = (int) futureValue;
		System.out.println("After " + yearsN + " years, $ " + (int) currentValue + " saved at" +
				rate + "% will yield $" + (int) futureValue);

	}
}