package dec31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://mypage.rediff.com/login/dologin");
		Thread.sleep(5000);
		//click on sign in button
		driver.findElement(By.linkText("Sign In")).click();
		//capture alert message
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		Thread.sleep(5000);
		//click ok to alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		

	}

}
