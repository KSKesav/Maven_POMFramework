package dec23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	        public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://google.com");
			// suspend tool for 5 seconds
			Thread.sleep(5000);
			driver.quit();
			}
	}


