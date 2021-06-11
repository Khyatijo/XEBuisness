package org.expleo.XE.MainPage;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;

import org.expleo.XE.BaseResources.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage extends Base  {
	 
	 //private By MainBodysectionElement = By.xpath("//*[@id = \"siteHeader\"]/following-sibling::div[1]");
	    WebDriver driver;
	    private By FirstPopUps = By.xpath("//button[contains(@id , 'yie-close-button')]");
	    private By SecondPopUps = By.xpath("//button[contains(@id , 'yie-close-button')]");
	    public MainPage(WebDriver driver)throws IOException {
            super();
	        this.driver=driver;

	    }
        //code for launching the browser
	    public void LaunchURL() throws IOException
	    {
	    
	    	driver.get(getURL());
	        
	    }
	   //Navigate to Main Panel
	    public MainPanelNavigation NavigateMainPanel() {
			return new MainPanelNavigation(driver);
		}
		//public By MainBody() {
			//return MainBodysectionElement;
		//}
		
	    public void CloseFirstPopups()
	    {
	    	List<WebElement> elems=driver.findElements(FirstPopUps);
			elems.get(1).click();
			elems.get(0).click();
			
	    }
	    public void MaximizeWindow()
	  
	    {
	    	driver.manage().window().maximize();
	    }
        public void CloseSecondPopups()
        {
        	List<WebElement> elems=driver.findElements(SecondPopUps);
    		int size = elems.size();
    	    if(size == 3)
    	    {
    		elems.get(size-1).click();
    		}
    	}
        }



