package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.Util1;

public class HomePage extends Util1{
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[@class='page-title big']")
	private WebElement homepagetitle;
	
	@FindBy(xpath="//span[text()='Funds']")
	private WebElement FundText;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean CheckForHomepage() {
		
		try {
			explicitWait(driver,homepagetitle,5);
			
		}catch(Exception e) {
			
			return false;
		}
		
		return true;
	}
	
	public void ClickOnFundText() {
		
		FundText.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
