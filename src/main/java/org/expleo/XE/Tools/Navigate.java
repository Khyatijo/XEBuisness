package org.expleo.XE.Tools;

import org.openqa.selenium.WebDriver;

public class Navigate {
	WebDriver driver;

	public Navigate(WebDriver driver) {
	  this.driver = driver;
	}
     public Convertor NavigateToConvertor()
     {
    	 return new Convertor(driver);
     }
}
