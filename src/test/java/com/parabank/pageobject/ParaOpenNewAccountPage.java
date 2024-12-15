package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaOpenNewAccountPage {

	Page page;
	Locator accountTypedropDown,openNewAccountBtn,newAccountId;
	
	public ParaOpenNewAccountPage(Page page)
	{
		this.page = page;
		accountTypedropDown = page.locator("//select[@id='type']");
		openNewAccountBtn = page.locator("//input[@type='button' and @value='Open New Account']");
		newAccountId = page.locator("//div[@id ='openAccountResult']//a[@id='newAccountId']");
	}
	
	public void selectAccountType(String accountType)
	{
		accountTypedropDown.selectOption(accountType);
	}
	
	public void clickOnOpenNewAccountBtn()
	{
		openNewAccountBtn.click();
	}
	
	public String getNewAccountId()
	{
		return newAccountId.textContent();
	}
}
