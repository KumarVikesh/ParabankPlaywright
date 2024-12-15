package com.parabank.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ParaRegisterPage {

	Locator firstNameTxtBox,lastNameTxtBox,addressStreetTxtBox,addressCityTxtBox,addressStateTxtBox,addressZipCodeTxtBox
	        ,phoneNumberTxtBox,ssnTxtBox,usernameTxtBox,passwordTxtBox,repeatedPasswordTxtBox,registerBtn;
	
	Page page;
	
	public ParaRegisterPage(Page page)
	{
		this.page = page;
		firstNameTxtBox = page.locator("//input[contains(@id,'firstName')]");
		lastNameTxtBox = page.locator("//input[contains(@id,'lastName')]");
		addressStreetTxtBox = page.locator("//input[contains(@id,'address.street')]");
		addressCityTxtBox = page.locator("//input[contains(@id,'address.city')]");
		addressStateTxtBox = page.locator("//input[contains(@id,'address.state')]");
		addressZipCodeTxtBox = page.locator("//input[contains(@id,'address.zipCode')]");
		phoneNumberTxtBox = page.locator("//input[contains(@id,'phoneNumber')]");
		ssnTxtBox = page.locator("//input[contains(@id,'ssn')]");
		usernameTxtBox = page.locator("//input[contains(@id,'username')]");
		passwordTxtBox = page.locator("//input[contains(@id,'password')]");
		repeatedPasswordTxtBox = page.locator("//input[contains(@id,'repeatedPassword')]");
		registerBtn = page.locator("//input[@type='submit' and @value='Register']");
	}
	
	public void enterFirstName(String firstName)
	{
		firstNameTxtBox.fill(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		lastNameTxtBox.fill(lastName);
	}
	
	public void enterStreetAddress(String street)
	{
		addressStreetTxtBox.fill(street);
	}
	
	public void enterCity(String city)
	{
		addressCityTxtBox.fill(city);
	}
	
	public void enterState(String state)
	{
		addressStateTxtBox.fill(state);
	}
	
	public void enterZipCode(String zipCode)
	{
		addressZipCodeTxtBox.fill(zipCode);
	}
	
	public void enterPhoneNumber(String phoneNumber)
	{
		phoneNumberTxtBox.fill(phoneNumber);
	}
	
	public void enterSSN(String ssn)
	{
		ssnTxtBox.fill(ssn);
	}
	
	public void enterUserName(String userName)
	{
		usernameTxtBox.fill(userName);
	}
	
	public void enterPassword(String password)
	{
		passwordTxtBox.fill(password);
	}
	
	public void enterRepeatPassword(String password)
	{
		repeatedPasswordTxtBox.fill(password);
	}
	
	public void clickOnRegister()
	{
		registerBtn.click();
	}
}
