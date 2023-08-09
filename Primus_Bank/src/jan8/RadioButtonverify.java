package jan8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonverify {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
		Thread.sleep(5000);
		// get collection of radio button 
		List<WebElement> radios = driver.findElements(By.xpath("(//p[@class='fs-3 fw-600 c-neutral-900'])"));
		System.out.println("No of radio buttons :::"+radios.size());
		for (WebElement each : radios)
		{
			System.out.println(each.getText());
		}
	}

}
