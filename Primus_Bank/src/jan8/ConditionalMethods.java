package jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalMethods {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[starts-with(@id,'u_0')])[3]")).click();
		Thread.sleep(5000);
		WebElement reentermail = driver.findElement(By.xpath("(//*[contains(@name,'reg_e')])[2]"));
		//verify reentermail text box is displayed or not
		boolean value = reentermail.isDisplayed();
		System.out.println(value);
		
	}

}
