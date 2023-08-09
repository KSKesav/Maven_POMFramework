package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		//click on a new account
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(5000);
		//store day month and year listboxes into slect class
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		daylistbox.selectByValue("20");
		Thread.sleep(5000);
		monthlistbox.selectByVisibleText("Jul");
		Thread.sleep(5000);
		yearlistbox.selectByIndex(20);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();

	}

}
