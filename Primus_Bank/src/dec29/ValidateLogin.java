package dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(5000);
		//store username textbox into webelements
		WebElement username = driver.findElement(By.cssSelector(""));
		username.clear();
		username.sendKeys("Admin");
		//store password textbox into webelements
		WebElement password = driver.findElement(By.cssSelector(""));
		password.clear();
		password.sendKeys("Qedge123!@#");
		driver.findElement(By.cssSelector("")).submit();
		Thread.sleep(5000);
		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("login success:::::"+expected+"    "+actual);
			}
		else
		{
			//capture error message
			String message = driver.findElement(By.cssSelector("")).getText();
			System.out.println(message+"    "+expected+"     "+actual);
			
		}
		Thread.sleep(5000);
		driver.close();
		}

}
