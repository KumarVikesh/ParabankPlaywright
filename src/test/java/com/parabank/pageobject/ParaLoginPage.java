package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaLoginPage {
	
	Page page;
	Locator userNameTxtBox,passwordTxtBox,logInBtn;
		
	public ParaLoginPage(Page page)
	{
		this.page = page;
		userNameTxtBox = page.locator("//input[@name='username']");
		passwordTxtBox = page.locator("//input[@name='password']");
		logInBtn = page.locator("//input[@type='submit' and @value='Log In']");
	}
	
	public void enterUserName(String userName)
	{
		userNameTxtBox.fill(userName);
	}
	
	public void enterPassword(String password)
	{
		passwordTxtBox.fill(password);
	}
	public void clickOnLoginBtn()
	{
		logInBtn.click();
	}
}
