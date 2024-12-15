package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaAccountServicePage {

	Page page;
	Locator logOutLink,openNewAccountLink,accountsOverviewLink,transferFundsLink,payBillLink,findTransactionsLink,registrationCompletionMessage
	,openAccountResult,transferComplete,showOverViewMessage,billPaymentResultMessage;
	
	public ParaAccountServicePage(Page page)
	{
		this.page = page;
		logOutLink = page.locator("//a[contains(text(),'Log Out')]");
		openNewAccountLink = page.locator("//a[contains(text(),'Open New Account')]");
		accountsOverviewLink = page.locator("//a[contains(text(),'Accounts Overview')]");
		transferFundsLink = page.locator("//a[contains(text(),'Transfer Funds')]");
		payBillLink = page.locator("//a[contains(text(),'Bill Pay')]");
		findTransactionsLink = page.locator("//a[contains(text(),'Find Transactions')]");
		registrationCompletionMessage = page.locator("//div[@id='rightPanel']//h1");
		openAccountResult = page.locator("//div[@id='openAccountResult']//h1");
		transferComplete = page.locator("//div[@id='showResult']//h1");
		showOverViewMessage = page.locator("//div[@id='showOverview']//h1");
		billPaymentResultMessage = page.locator("//div[@id='billpayResult']//h1");	
	}
	
	public void clickOnLogout()
	{
		logOutLink.click();
	}
	
	public void clickOnOpenNewAccountLink()
	{
		openNewAccountLink.click();
	}
	
	public void clickOnAccountsOverviewLink()
	{
		accountsOverviewLink.click();
	}
	
	public void clickOnTransferFundsLink()
	{
		transferFundsLink.click();
	}
	
	public void clickOnPayBillLink()
	{
		payBillLink.click();
	}
	
	public String  getRegistrationCompletionMessage()
	{
		return registrationCompletionMessage.textContent();
	}
	
	public String getOpenAccountResult()
	{
		return openAccountResult.textContent().trim();
	}
	
	public String getTransferCompleteMessage()
	{
		return transferComplete.textContent().trim();
	}
	
	public String showAccountsOverviewMessage()
	{
		return showOverViewMessage.textContent().trim();
	}
	
	public String getBillPaymentResultMessage()
	{
		return billPaymentResultMessage.textContent().trim();
	}
}
