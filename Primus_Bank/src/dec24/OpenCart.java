package dec24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args)throws Throwable {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      //launch url
      driver.get("https://demo.opencart.com/");
      //suspend tool for 5 seconds 
      Thread.sleep(5000);
      //click my account
      driver.findElement(By.className("caret")).click();
      Thread.sleep(5000);
      driver.findElement(By.partialLinkText("Regist")).click();
      Thread.sleep(5000);
      driver.findElement(By.name("firstname")).sendKeys("kolusu");
      driver.findElement(By.id("input-lastname")).sendKeys("kesav");
      driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ksiakesac@gmail.com");
      driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9866864620");
      driver.findElement(By.name("password")).sendKeys("ksivak");
      driver.findElement(By.id("input-confirm")).sendKeys("ksivak");
      driver.findElement(By.xpath("//input[@name='agree']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@value='Continue']")).sendKeys(Keys.ENTER);
      Thread.sleep(5000);
      driver.close();
	}

}
