package jan4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		//mouse to fashions
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		//mouse to all
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(5000);
		//mouse to apple
		ac.moveToElement(driver.findElement(By.linkText("Apple"))).click().perform();
		Thread.sleep(5000);
		driver.close();



	}

}
