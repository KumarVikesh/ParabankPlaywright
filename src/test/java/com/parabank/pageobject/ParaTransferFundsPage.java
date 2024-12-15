package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaTransferFundsPage {

	Page page;
	Locator amountTxtBox,fromAccountDropDown,toAccountDropDown,transferBtn;
	public ParaTransferFundsPage(Page page)
	{
		this.page = page;
		amountTxtBox = page.locator("//input[@id='amount']");
		fromAccountDropDown = page.locator("//select[@id='fromAccountId']");
		toAccountDropDown = page.locator("//select[@id='toAccountId']");
		transferBtn = page.locator("//input[@type='submit' and @value='Transfer']");
	}
	
	public void enterAmountToBeTransferred(double amount)
	{
		amountTxtBox.fill(String.valueOf(amount));
	}
	
	public void selectFromAccountId(String accountNumber)
	{
		fromAccountDropDown.selectOption(accountNumber);
		
	}
	
	public void clickOnTransfer()
	{
		transferBtn.click();
	}
}
