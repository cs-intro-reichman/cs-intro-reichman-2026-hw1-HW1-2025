// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * (Math.pow((1 + rate),n))/100;

		System.out.println("After " + (int)n + " years, $" + (int)currentValue + " saved at " + rate + "% will yield " + (int)futureValue + "$");

		//להבין למה יצא לי מספר לא טוב בערך העתידי
	}
}