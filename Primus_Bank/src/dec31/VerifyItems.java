package dec31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItems {

	public static void main(String[] args)throws Throwable {
		String expecteditem = "furniture";
		//String expecteditem = "hyderabad";
		boolean itemexit= false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items
		List<WebElement> olist = dropdown.getOptions();
		System.out.println("No of items are::::"+olist.size());
		Thread.sleep(5000);
		for(WebElement each: olist)
		{
			String actualitems = each.getText();
			Thread.sleep(1000);
			System.out.println(actualitems);
			if(actualitems.equalsIgnoreCase(expecteditem))
			{
				itemexit= true;
				break;
			}
		}
		//itemexit holding true (or) false
		if(itemexit)
		{
			System.out.println("items found in the list box:::::"+expecteditem);
			
		}
		else
		{
			System.out.println("items not found in listbox:::::"+expecteditem);
			
		}
		Thread.sleep(5000);
		driver.close();


	}

}
