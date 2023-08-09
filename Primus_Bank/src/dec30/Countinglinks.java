package dec30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinks {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(5000);
		//get collection of links in a page which are stored into html tag a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links are :::"+links.size());
		Thread.sleep(5000);
		//iterate all links
		for(WebElement each : links)
		{
			String linkname= each.getText();
			Thread.sleep(500);
			System.out.println(linkname);
		}
		driver.quit();



	}

}
