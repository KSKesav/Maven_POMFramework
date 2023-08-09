package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GmailLogin {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Dimension ds = new Dimension(600, 600);
		driver.manage().window().setSize(ds);
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ksivakesav@gmail.com");
		//driver.findElement(By.xpath("")).sendKeys("");
		
		
		

	}

}
