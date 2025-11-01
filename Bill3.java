// Splits a restaurant bill evenly amongst three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = Double.parseDouble(args[3]);
		double amount = (double) Math.round(bill / 3);
		// System.out.println(name1 + name2 + name3 + bill + amount);
		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ": pay " + amount + " Shekels each");

	}
}
