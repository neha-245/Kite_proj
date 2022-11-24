package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {

	public static WebDriver getdriver() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disabled-notification");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}
	
}
