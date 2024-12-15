package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaHomePage {

	Page page;
	Locator registerLink;
	
	public ParaHomePage(Page page)
	{
		this.page = page;
		registerLink = page.locator("//a[contains(text(),'Register')]");
	}
	
	public void clickOnRegisterLink()
	{
		registerLink.click();
	}	
}
