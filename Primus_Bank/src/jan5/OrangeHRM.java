package jan5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
		//create account
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		//mouse to Admin
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']"))).click().perform();
		//get collection of rows and coloums
		WebElement table = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		//iterate all rows
		for(WebElement eachrow : rows)
		{
			List<WebElement> clums = eachrow.findElements(By.tagName("td"));
			for(WebElement  eachcell : clums)
			{
				Thread.sleep(1000);
				String celltext = eachcell.getText();
				System.out.print(celltext+"\t");
				
			}
			System.out.println();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
		}
		
	}

}
