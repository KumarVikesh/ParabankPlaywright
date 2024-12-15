package com.parabank.pageobject;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaBillPaymentServicePage {

	Page page;
	Locator payeeNameTxtBox,payeeSteetAddressTxtBox,payeeCityAddressTxtBox,payeeStateAddressTxtBox,payeeZipCodeTxtBox,payeePhoneNumberTxtBox,
			payeeAccountNumberTxtBox,payeeVerifyAccountTxtBox,amount,fromAccountIdDropDown,sendPaymentBtn;
			
	public ParaBillPaymentServicePage(Page page)
	{
		this.page = page;
		payeeNameTxtBox = page.locator("//input[@name='payee.name']");
		payeeSteetAddressTxtBox = page.locator("//input[@name='payee.address.street']");
		payeeCityAddressTxtBox = page.locator("//input[@name='payee.address.city']");
		payeeStateAddressTxtBox = page.locator("//input[@name='payee.address.state']");
		payeeZipCodeTxtBox = page.locator("//input[@name='payee.address.zipCode']");
		payeePhoneNumberTxtBox = page.locator("//input[@name='payee.phoneNumber']");
		payeeAccountNumberTxtBox = page.locator("//input[@name='payee.accountNumber']");
		payeeVerifyAccountTxtBox = page.locator("//input[@name='verifyAccount']");
		amount = page.locator("//input[@name='amount']");
		fromAccountIdDropDown = page.locator("//select[@name='fromAccountId']");
		sendPaymentBtn = page.locator("//input[@type='button' and @value='Send Payment']");
	}
	
	public void enterPayeeName(String payeeName)
	{
		payeeNameTxtBox.fill(payeeName);
	}
	
	public void enterPayeeStreetAddress(String payeeStreetAddress)
	{
		payeeSteetAddressTxtBox.fill(payeeStreetAddress);
	}
	
	public void enterPayeeCityAddress(String payeeCityAddress)
	{
		payeeCityAddressTxtBox.fill(payeeCityAddress);
	}
	
	public void enterPayeeStateAddress(String payeeStateAddress)
	{
		payeeStateAddressTxtBox.fill(payeeStateAddress);
	}
	
	public void enterPayeeZipCode(String payeeZipCode)
	{
		payeeZipCodeTxtBox.fill(payeeZipCode);
	}
	
	public void enterPayeePhoneNumber(String payeePhoneNumber)
	{
		payeePhoneNumberTxtBox.fill(payeePhoneNumber);
	}
	
	public void enterPayeeAccountNumber(String payeeAccountNumber)
	{
		payeeAccountNumberTxtBox.fill(payeeAccountNumber);
	}
	
	public void enterPayeeAccountNumberConfirmation(String payeeAccountNumber)
	{
		payeeVerifyAccountTxtBox.fill(payeeAccountNumber);
	}
	
	public void enterAmount(double amountToBeSent)
	{
		amount.fill(String.valueOf(amountToBeSent));
	}
	
	public void selectFromAccount(String accountNumber)
	{
		fromAccountIdDropDown.selectOption(accountNumber);
	}
	
	public void clickOnSendPaymentBtn()
	{
		sendPaymentBtn.click();
	}
}
