package com.parabank.utilities;

import java.util.Random;

public class GenerateRandomNumber {

	static int rNumber;
	
	public static int getRandomNumber()
	{
		Random rand = new Random();
		rNumber = rand.nextInt(1000);
		return rNumber;
	}
}
