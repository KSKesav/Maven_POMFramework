package dec21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChromeBrowser {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation_Selenium\\Primus_Bank\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		// suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.quit();
		
	}

}

