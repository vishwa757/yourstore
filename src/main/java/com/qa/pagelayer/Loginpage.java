package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Loginpage extends Testbase
{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']") 
	private WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']") 
	private WebElement login;
	
	@FindBy(xpath="//input[@id='input-email']") 
	private WebElement MailAddress;
	
	@FindBy(xpath="//input[@id='input-password']") 
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']") 
	private WebElement login2;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	private WebElement logout;
	
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	private WebElement continueBtn;
	
	//===================================================================================
	
	public void clickonMyaccount()
	{
		myAccount.click();
	}
	public void clickonlogin()
	{
		login.click();
	}
	public void enterEmail(String mail)
	{
		MailAddress.sendKeys(mail);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonlogin2()
	{
		login2.click();
	}
	public void clickonlogout()
	{
		logout.click();
	}
	public void clickoncontinue()
	{
		continueBtn.click();
	}
	

}
