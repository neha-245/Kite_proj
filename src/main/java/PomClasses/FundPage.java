package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClass.Util1;

public class FundPage extends Util1 {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement addfundbtn;

	@FindBy(xpath="//h1[text()='Deposit funds']")
	private WebElement depositefundtext;
	
    @FindBy(xpath="//input[@id='addfunds_amount']")
    private WebElement addDepositeAmountfundText;
	
    @FindBy(xpath="//select[@id='segment_select']")
    private WebElement selectSegmentDropdown;
    
    @FindBy(xpath="//select[@id='account_select']")
    private WebElement selectAccountDropdown;
    
    @FindBy(xpath="//input[@id='addfunds_vpa']")
    private WebElement upiField;
    
    @FindBy(xpath="//button[@id='addfunds_submit']")
    private WebElement continueBtn;
    
	@FindBy(xpath="//p[text()='Click on the notification received on your UPI App & enter your UPI PIN']")
	 private WebElement depositConfirmationText;
	
	public FundPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); 
		this.driver = driver;
		
	}	
	public boolean CheckFundWindow() {
		try {
			explicitWait(driver,addfundbtn,5 );
			
		}catch(Exception e) {return false;}
		
		return true;
	}
	
  public void ClickOnAddFundBtn() {
	
	  addfundbtn.click();
}

  public boolean CheckfordepositeFundWindow() {
	  
	  SwitchTochildpopup(driver);
	  
	  try {
		  explicitWait(driver,depositefundtext,5);
		  
	  }catch(Exception e) {
		  
		  return false;
	  }
	  return true;
  }
  
  public void enterDepositeAmount() {
	  
	  depositefundtext.sendKeys("10");
	  
	  }
  public void SelectSegment() {
	  
	  Select sel= new Select(selectSegmentDropdown);
	  
	  sel.selectByIndex(0);
  }
  
  public void selectBankAccount() {
	  
	  Select sel = new Select(selectAccountDropdown);
	  
	  sel.selectByIndex(0);
	  
  }
  
  public void Enterupi() {
	  
	  upiField.clear();
	  
	  upiField.sendKeys("8766913634@ybl");
	  
  }
  
  public void ClickOnContinueBtn() {
	  
	  continueBtn.click();
  }
  
  public boolean CheckForTransitionWindow() {
	  
	  SwitchTochildpopup(driver);
	  try {
		  
		  explicitWait(driver, depositConfirmationText,5 );
	  }catch(Exception e) {
		  
		  return false;
	  }
	  return true;
  }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

