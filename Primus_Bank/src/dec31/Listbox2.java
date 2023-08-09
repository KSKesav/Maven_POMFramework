package dec31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		//store listbox into slect class
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in dropdown
		List<WebElement> olist = dropdown.getOptions();
		System.out.println("No of items are:::::"+olist.size());
		//iterate all items 
		for(WebElement each :olist)
		{
			String itemname = each.getText();
			Thread.sleep(2000);
			System.out.println(itemname);
			each.click();
		}
		Thread.sleep(5000);
		driver.close();

	}

}
