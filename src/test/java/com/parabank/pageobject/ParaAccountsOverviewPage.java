package com.parabank.pageobject;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaAccountsOverviewPage {

	Page page;
	Locator initialAccountNumber,initialAccountBalance,accountBalance;
	
	public ParaAccountsOverviewPage(Page page)
	{
		this.page = page;
		initialAccountNumber = page.locator("//table[@id='accountTable']//tbody//tr[1]//td[1]");
		initialAccountBalance = page.locator("//table[@id='accountTable']//tbody//tr[1]//td[2]");
	}
	
	public String getAccountBalance(String accountNumber)
	{
		accountBalance = page.locator("//table[@id='accountTable']//tbody//a[contains(text(),'"+accountNumber+"')]//following::td[1]");
		return accountBalance.textContent();
	}
	
	public String getInitialAccountNumber()
	{
		return initialAccountNumber.textContent();
	}
	
	public String getInitialAccountBalance()
	{
		return initialAccountBalance.textContent();
	}
	
}
