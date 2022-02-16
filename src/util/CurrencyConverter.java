package util;

public class CurrencyConverter {

	public static double converter(double price, double quantity) {
		double value = price * quantity;
		return value + (value * 0.06);
	}
}
