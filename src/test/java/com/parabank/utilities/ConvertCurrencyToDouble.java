package com.parabank.utilities;

public class ConvertCurrencyToDouble {

	public static double getNumericValue(String currency)
	{
		String dollor = currency.replace("$","");
		double d = Double.valueOf(dollor);
		return d;
	}
}
