package PomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.Util1;

public class Loginpage extends Util1 {
	
	@FindBy(xpath="//input[@id='userid']")
    private WebElement UserId;
		
    @FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
    private WebElement ClickButton;
	
	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId() throws IOException {
		
		UserId.sendKeys(getDataFromConfig("UserId"));
	}
	
	public void EnterPassword() throws IOException {
		
		password.sendKeys(getDataFromConfig("password"));
	}
	
	public void CliclOnLoginButton() {
		
		ClickButton.click();
	}
}
