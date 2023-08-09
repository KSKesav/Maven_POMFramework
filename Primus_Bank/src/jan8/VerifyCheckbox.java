package jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCheckbox {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		// verify checkbox is active or inactive if it active uncheck it
		WebElement checkbox = driver.findElement(By.id("remember"));
		boolean value = checkbox.isSelected();
		System.out.println(value);
		// uncheckit
		checkbox.click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
