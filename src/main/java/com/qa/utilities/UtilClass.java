package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class UtilClass extends Testbase
{
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takesSS(String name) throws IOException
	{
		String path = "C:\\Users\\kavya\\eclipse-workspace\\yourstore\\screenshot\\";
		
		
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path+name+".png");
			FileHandler.copy(source, destination);
		
	}
	
	public static String readConfigfile(String key) throws IOException
	{
		String path = "C:\\Users\\kavya\\eclipse-workspace\\yourstore\\PropertyFile.properties";
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
}
