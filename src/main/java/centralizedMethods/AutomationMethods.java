package centralizedMethods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationMethods extends Listeners{
	
	
	
	public WebDriver driver=null;
	public static Properties prop=new Properties();
	public FileReader fis=null;
	
	
	
	public void initialise() throws IOException {		 
		fis=new FileReader("C:\\Eclipse-workspace\\TestngProject\\src\\test\\resources\\PropertiesFiles\\OrangehrmPropertiesFile.properties");
		if (fis != null) {
			prop.load(fis);
		} else {
			throw new FileNotFoundException("Unable to find the given property file");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void openChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//driver.get("https://classic.crmpro.com/index.html");
         }
	
	public void click(String xpath,String elementName) {
		ewait(xpath);
		try {
			driver.findElement(By.xpath(xpath)).click();			
			getExtent().log(Status.INFO, "Clicked on "+elementName+" successfully");
		}catch(Exception e) {
			getExtent().log(Status.FAIL, "Unable to click on "+elementName);
			new Assertion().fail();
		}
	}
	public void clearNEnterText(String xpath,String text,String elementName) {
		ewait(xpath);
		try {
			driver.findElement(By.xpath(xpath)).clear();
			getExtent().log(Status.INFO, "Cleared "+elementName+" Field successfully");
			driver.findElement(By.xpath(xpath)).sendKeys(text);
			getExtent().log(Status.INFO, "Entered "+text+" in "+elementName+" successfully");
		}catch(Exception e) {
			System.out.println(e);
			getExtent().log(Status.INFO, "Unable to clear and enter "+text+" in "+elementName);
		}
	}
	@SuppressWarnings("deprecation")
	public void ewait(String xpath) {
		try {
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}catch(Exception e) {
			System.out.println("Element is not visible with in the given time");
		}
		}
	
	public void verifyIsDisplayed(String xpath,String elementName) {
		ewait(xpath);
		try {
			driver.findElement(By.xpath(xpath)).isDisplayed();
			getExtent().log(Status.INFO,"Displayed "+elementName+" successfully");			
		}catch(Exception e) {
			getExtent().log(Status.INFO,"Unable to Display "+elementName);
		}
	}
	
	public void verifyIsDisplayedNClick(String xpath,String elementName) {
		ewait(xpath);
		try {
			if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
				driver.findElement(By.xpath(xpath)).click();
				getExtent().log(Status.INFO,"Displayed "+elementName+" and clicked on it successfully");				
			}			
		}catch(Exception e) {
			getExtent().log(Status.INFO,"Unable to display "+elementName+" hence not clicked");	
		}
	}
	
	public void verifyIsNotDisplayed(String xpath,String elementName) {
		ewait(xpath);
		try {
			if(!driver.findElement(By.xpath(xpath)).isDisplayed()) {
				getExtent().log(Status.INFO,elementName+" not displayed successfully");
			}
		}catch(Exception e) {
			System.out.println("Element is displayed"+elementName);
			getExtent().log(Status.FAIL,elementName+" should not be displayed but it displayed");
		}
	}
	
	public String userNamexpath="//*[@name='txtUsername']";
	public String passwordxpath="//*[@name='txtPassword']";
	public String loginbutton="//*[@type='submit']";
	
	public void loginhrm(String url,String userName,String password) throws InterruptedException {
		driver.get(url);
		clearNEnterText(userNamexpath, userName, "username");
		clearNEnterText(passwordxpath, password, "pwd");
		click(loginbutton, "LogButton");
	}
}
