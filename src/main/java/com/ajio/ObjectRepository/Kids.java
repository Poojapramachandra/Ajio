package com.ajio.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kids {
	
	public void kids(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='https://assets.ajio.com/cms/AJIO/WEB/11032022-D-KHP-shopbyproduct-header.jpg']")
    private WebElement StyleHitslink;
	
	
	@FindBy(xpath="//a[@href='/s/starting-at-rs-199-4625-8751']")
	private WebElement TopsAadTees;

	public WebElement getStyleHitslink() {
		return StyleHitslink;
	}
	
	
	public WebElement getTopsAadTees() {
		return TopsAadTees;
	}



	/**
	 * this  method will click on Style Hits Link
	 */
	public void StyleHitsLink(){
		StyleHitslink.click();
	}
	
	/**
	 * This method will click on Tops and Tees
	 */
	public void TopsAndTees(){
		TopsAadTees.click();
	}
	
	
}
