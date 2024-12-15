package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaFindTransactionPage {
	
	Page page;
	Locator findTransactionsByAmountBtn,amountTxtBox;
	
	public ParaFindTransactionPage(Page page)
	{
		this.page = page;
		findTransactionsByAmountBtn = page.locator("//button[@type='submit' and @id='findByAmount']");
		amountTxtBox = page.locator("//input[@id='amount']");
	}
	
	public void enterAmount(float amount)
	{
		amountTxtBox.fill(String.valueOf(amount));
	}
	
	public void clickOnFindTransactionsByAmountButton()
	{
		findTransactionsByAmountBtn.click();
	}
}
