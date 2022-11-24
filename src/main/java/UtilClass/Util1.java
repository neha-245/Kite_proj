package UtilClass;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {
	
	
	public static String getDataFromConfig(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("Configuration\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		String value = prop.getProperty(key);
		
		return value;
	}

	
	public static void explicitWait(WebDriver driver, WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
    public static void SwitchTochildpopup(WebDriver driver) {
    	
    	List<String> addresslist = new ArrayList<String>(driver.getWindowHandles());
    	
    	driver.switchTo().frame(addresslist.get(1));
    	
    }
	
}
