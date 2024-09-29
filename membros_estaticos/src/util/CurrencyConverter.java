package util;

public class CurrencyConverter {
	
	public static double tax = 1.06;
	
	public static double dollarConverter(double valor, double dolar) {
		return valor * dolar * tax;
	}
}
