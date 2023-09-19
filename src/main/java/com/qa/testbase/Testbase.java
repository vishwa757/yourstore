package com.qa.testbase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(UtilClass.readConfigfile("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
