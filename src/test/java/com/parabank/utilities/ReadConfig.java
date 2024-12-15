package com.parabank.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	String path = System.getProperty("user.dir")+"\\Configuration\\config.properties";
	
	public ReadConfig()
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseurl");
		if(value != null)
			return value;
		else
			throw new RuntimeException("Base URL not found!!");
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
		if(value != null)
			return value;
		else
			throw new RuntimeException("Browser not found!!");
	}
}
