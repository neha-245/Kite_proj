package Fund_Module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base1;
import PomClasses.FundPage;
import PomClasses.HomePage;
import PomClasses.Loginpage;

public class VerifyUserCanAddFundsInAccounts {
	
	WebDriver driver;
	Loginpage lp;
	HomePage hp;
	FundPage fp;
	
	@BeforeClass
	public void beforeclass() {
		
		driver = Base1.getdriver();
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		lp = new Loginpage(driver);
		hp = new HomePage(driver);
		fp = new FundPage(driver);
	}

	@Test(priority=1)
	public void VerifyUserCanLogin() throws IOException {
		
		lp.EnterUserId();
		lp.EnterPassword();
		lp.CliclOnLoginButton();
		
		Assert.assertTrue(hp.CheckForHomepage());
	}
	
	@Test(priority=2)
	public void VerifyUserCanOpenFundWindow() {
		
		Assert.assertTrue(fp.CheckFundWindow());
	}
	
	@Test(priority=3)
	public void VerifyUserCanOpenDepositFundWindowByClickingOnAddFundBtn() {
		
		fp.ClickOnAddFundBtn();

		Assert.assertTrue(fp.CheckfordepositeFundWindow());
}
	
	@Test(priority=4)
	public void VerifyUserCanAddRequiredDetailsAndClickOnContinueBtn() {
		
	   fp.enterDepositeAmount();
	   fp.SelectSegment();
	   fp.selectBankAccount();
	   fp.Enterupi();
	   fp.ClickOnContinueBtn();
	   
	   Assert.assertTrue(fp.CheckForTransitionWindow());
	}
	
	@AfterMethod
	public void aftermethod() {
		
		
	}
	
	@AfterClass
	public void afterclass() {
		
		
	}
}


