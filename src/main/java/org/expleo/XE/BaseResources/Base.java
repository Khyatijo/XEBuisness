package org.expleo.XE.BaseResources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

import org.expleo.XE.MainPage.*;

public class Base {
	 WebDriver driver;
		 public Properties p;
		FileReader reader;
		public Base() throws IOException
	    {
			 reader=new FileReader(System.getProperty("user.dir")+"/src/main/java/org/expleo/XE/BaseResources/data.properties");  
		     p=new Properties();  
			 p.load(reader);
	    }
		
		public  WebDriver InitializeDriver()
		{
			    String s = p.getProperty("browser");
			    String browser = "chrome";
			    System.out.println(s);
			    if(s.equals(browser))
			    	System.out.println(s);
			    {
			    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			    	driver =new ChromeDriver();
			    	
			    }
				return driver;
				
	    }
		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;


		}

    
	public String getURL() throws IOException
	{
		p.load(reader);
		String s = p.getProperty("URL");
		System.out.println(s);
		return s;
		
	}
	}


