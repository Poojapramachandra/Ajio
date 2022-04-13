package com.ajio.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public  HomePage (WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(linkText="MEN")
	private WebElement Men;
	
	@FindBy(linkText="WOMEN")
	private WebElement Women;
	
	
	@FindBy(linkText="KIDS")
	private WebElement Kids;
	
	
	@FindBy(linkText="INDIE")
	private WebElement Indie;
	
	
	@FindBy(linkText="HOME AND KITCHEN")
	private WebElement HomeAndKitchen;


	public WebElement getMen() {
		return Men;
	}


	public WebElement getWomen() {
		return Women;
	}


	public WebElement getKids() {
		return Kids;
	}


	public WebElement getIndie() {
		return Indie;
	}


	public WebElement getHomeAndKitchen() {
		return HomeAndKitchen;
	}

	
	/**
	 * This method will click on kids on HomePage
	 */
	public void ClickOnKids(){
		Kids.click();
	}
	
	
	
}
