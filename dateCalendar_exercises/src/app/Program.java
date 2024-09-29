package app;

import java.util.Calendar;

public class Program {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	     // Sets the given calendar field value and the time value
	     // (millisecond offset from the Epoch) of this Calendar undefined.
	     cal.clear();
	     cal.set(Calendar.YEAR, 2020);
	     cal.set(Calendar.MONTH, 0);
	     cal.set(Calendar.DATE, 1);

	     System.out.println(cal.getTime());
	     System.out.println();
	}

}
