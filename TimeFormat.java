// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		System.out.println(minutes);

		String fullMinutes = Integer.toString(minutes);
		Boolean pm = false;
		if (hours == 12) {
			pm = true;
		}
		//Checks if the time is greater than 12
		if (hours > 12)
		{
			hours = hours - 12;
			pm = true;
		}
		//Checks if the minutes are a single digit to add 0
		if (minutes < 10)
		{
		fullMinutes = "0" + minutes;	
		}
		//Prints the time according to pm and am
		if (pm == true){
		System.out.println( hours + ":" + fullMinutes + " PM");
		}
		else {
		System.out.println( hours + ":" + fullMinutes + " AM");	
		}
	
	}

}