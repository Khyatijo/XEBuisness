package org.expleo.XE.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.expleo.XE.CommonClasses.*;

public class Convertor extends AbstractComponent {
	private By Convert =  By.xpath("//span[text() = 'Convert']//parent::a");
	//private By Amount = By.xpath("//input[@id = \"amount\"]//parent::span//parent::div");
	private By Amount = By.id("amount");
	private By from = By.id("midmarketFromCurrency");
	private By to = By.id("midmarketToCurrency");
	private By ConvertButton = By.xpath("//button[text() = 'Convert']");
	private By FromDropDownList = By.xpath("//li[@id =\"midmarketFromCurrency-option-0\"]");
	private By ToDropDownList = By.xpath("//li[@id =\"midmarketToCurrency-option-0\"]");

	public Convertor(WebDriver driver)
	{
		super(driver);
	}
	//To click on Convert option under Tool menu
	public void clickOnConvertor()
	{
		findElement(Convert).click();
	}
	//to click on Amount textBox on MainPage
	public void clickOnAmount()
	{
		findElement(Amount).click();
	
	}
	// to click on From Currency option Text box on main Page
	public void clickOnFrom()
	{
		findElement(from).click();
		
	}
	// to click on To Currency option Text box on main Page
	public void clickOnTo()
	{
		findElement(from).click();
		
	}
	public void EnterFromCurrency(String search) throws InterruptedException
	{
       findElement(from).sendKeys(search);
       Thread.sleep(5000);
       findElement(FromDropDownList).click();
	
		}
	public void EnterToCurrency(String search) throws InterruptedException
	{
		findElement(to).sendKeys(search);
		Thread.sleep(5000);
		findElement(ToDropDownList).click();
		
	}
	public void EnterAmount(String i)
	{
		findElement(Amount).sendKeys(i);
	}
	public void ClickOnConvertButton()
	{
		findElement(ConvertButton).click();	
	}
}
