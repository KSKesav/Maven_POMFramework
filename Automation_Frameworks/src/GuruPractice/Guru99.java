package GuruPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

	public static void main(String[] args)throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr450370");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YhuvYnA");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
