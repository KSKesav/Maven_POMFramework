package jan8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingCheckbox {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///‪D:/checkbox_1.html");
		Thread.sleep(5000);
		// get collection of check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No of checkboxes are :::"+checkboxes.size());
		for(WebElement each : checkboxes)
		{
			// verify which checkbox is active and in active
			boolean value = each.isSelected();
			// get each checkbosx name which are stored into value property 
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+"\n"+value);
			if(value)
			{
				each.click();
			}
			else
			{
				each.click();
			}
			Thread.sleep(5000);
		}
		
		
	
		

	}

}
