package Oog.expleo.XE.stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.expleo.XE.MainPage.*;
import org.expleo.XE.Tools.*;

import java.io.IOException;
import java.util.List;

import org.expleo.XE.BaseResources.*;



@RunWith(Cucumber.class)
public class StepDefinitions extends Base {
	MainPage mainPage;
	WebDriver driver;
	Convertor ConvertorComponent;

	public StepDefinitions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Given("^user opens the Web Browser$")
	public void user_opens_the_Web_Browser() throws Throwable {
	    driver = InitializeDriver();
	    System.out.println("hii");
	}

	@When("^user navigates to the url$")
	public void user_navigates_to_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     mainPage = new MainPage(driver);
	     mainPage.LaunchURL();
	}

	@Then("^The page loads and the main logo is shown on the page$")
	public void the_page_loads_and_the_main_logo_is_shown_on_the_page() throws Throwable {
    	mainPage.MaximizeWindow();
    	Thread.sleep(10000);
    	Assert.assertTrue(mainPage.NavigateMainPanel().IsElementExists());
    	mainPage.CloseFirstPopups();
	}

	@Given("^The covert option is selected by the user$")
	public void the_covert_option_is_selected_by_the_user() throws Throwable {
		
		
		ConvertorComponent = mainPage.NavigateMainPanel().NavigateToTool().NavigateToConvertor();
        ConvertorComponent.clickOnConvertor();
		}

	@When("^User enter the Amount \"([^\"]*)\"$")
	public void user_enter_the_amount_something(String amount) throws Throwable {
	    Thread.sleep(2000);
	    System.out.println("dd");
	   
			ConvertorComponent.clickOnAmount();
		    ConvertorComponent.EnterAmount(amount);
			}
	

	@When("^User select currency From DropDownList<From>$")
	public void user_select_currency_From_DropDownList_From() throws Throwable {
	    Thread.sleep(3000);
		ConvertorComponent.clickOnFrom();
	
	    ConvertorComponent.EnterFromCurrency("EUR");
	    
	}

	@When("^User select currency To DropDownList<To>$")
	public void user_select_currency_To_DropDownList_To() throws Throwable {
	    ConvertorComponent.clickOnTo();
	    ConvertorComponent.EnterToCurrency("INR");
	}

	@When("^User click on the convert button$")
	public void user_click_on_the_convert_button() throws Throwable {
	    Thread.sleep(5000);
	    ConvertorComponent.ClickOnConvertButton();
	    Thread.sleep(10000);
	   mainPage.CloseSecondPopups();
	}

	@Then("^Currency conversion result is displayed$")
	public void currency_conversion_result_is_displayed() throws Throwable {
		//String expectVal="1000"+" Euros =";
		//String xpath= "//p[contains(text() ,’"+expectVal+"’)]";
		//Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
		List<WebElement> elems = driver.findElements(By.xpath("//p[contains(@class , 'result')]"));
         String s = elems.get(0).getText();
         String s1 = elems.get(1).getText();
         String main = s+s1;
         System.out.println(s1);
         Assert.assertTrue(s.contains("Euro"));
         Assert.assertTrue(s1.contains("Indian Rupees"));
         System.out.println(s);
	}
	
	@After
	public void quitDriver()
	{
		driver.quit();
	}

	}