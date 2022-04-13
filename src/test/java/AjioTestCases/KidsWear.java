package AjioTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ajio.ObjectRepository.HomePage;

import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KidsWear {
	public static void main(String[] args) throws Throwable {
	//ranju
	//Run time poly
	 WebDriver driver = null;
    
	WebDriverUtility wlib = new WebDriverUtility();
	FileUtility flib= new FileUtility();
	String url = flib.readDataFromPropertiesFile("url");
	String browser= flib.readDataFromPropertiesFile("browser");
	
	//To handle notification popup
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	     driver= new ChromeDriver(options);	
	}else if(browser.equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
	     driver= new FirefoxDriver();	
	}else{
		System.out.println("browser not supported");
	}
     driver.get(url);
     wlib.waitforPageToLoad(driver);
     
	//Homepage is Dispalyed
	HomePage home= new HomePage(driver);
	home.ClickOnKids();
	
	
	
	
	
	}
	

	
	

}
