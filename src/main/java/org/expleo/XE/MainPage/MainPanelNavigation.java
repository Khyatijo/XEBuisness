package org.expleo.XE.MainPage;
import org.expleo.XE.Tools.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.expleo.XE.CommonClasses.AbstractComponent;
import org.expleo.XE.SendMoney.*;
import org.expleo.XE.SendMoney.*;

public class MainPanelNavigation extends AbstractComponent {
   
   
   By MainLogo = By.xpath("//*[@aria-label=\"Home\"]");
  
   
	public MainPanelNavigation(WebDriver driver2) {
		super(driver2);
	}
	public Navigate NavigateToTool()
	{
		return new Navigate(driver);
	}

   // public Navigate NavigateToSendMoney()
    //{
    	//return MainPanel;
    //}
	public Boolean IsElementExists ()
	{
		return WaitForVisibility(5,MainLogo).isDisplayed();
		
	}
	public void NavigateMainLogo()
	{
		findElement(MainLogo).click();
	}
}
