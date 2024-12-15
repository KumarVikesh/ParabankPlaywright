package com.parabank.testcases;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.parabank.utilities.ReadConfig;


public class BaseClass {

	ReadConfig rc = new ReadConfig();
	
	String url = rc.getBaseUrl();
	String browser = rc.getBrowser();
	
	public static Browser wbrowser;
	public static Page page;
	public static Logger logger;
	Playwright playwright;
	
	@BeforeClass
	public void setup()
	{
		playwright = Playwright.create();
		switch(browser.toLowerCase())
		{
		case "chrome":
			wbrowser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			
			break;
			
		case "msedge":
			wbrowser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
			break;
			
		case "firefox":
			wbrowser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
			break;
		default:
			wbrowser = null;
			break;
		}
		
		BrowserContext context = wbrowser.newContext(new Browser.NewContextOptions().setViewportSize(1536,864));
		page = context.newPage();
		page.waitForTimeout(5000);
		logger = LogManager.getLogger("ParaBank");
	}
	
	@AfterClass
	public void tearDown()
	{
		wbrowser.close();
	}
} 
