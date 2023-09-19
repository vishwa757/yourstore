package com.qa.testlayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;
import com.qa.utilities.UtilClass;

public class Testclass extends Testbase
{
	
	@Test
	public void verifyLogin() throws InterruptedException, IOException
	{
		Loginpage l = new Loginpage();
		l.clickonMyaccount();
		l.clickonlogin();
		l.enterEmail(UtilClass.readConfigfile("username"));
		l.enterPassword(UtilClass.readConfigfile("password"));
		l.clickonlogin2();
		l.clickonlogout();
		Thread.sleep(1000);
		l.clickoncontinue();
	}
}
