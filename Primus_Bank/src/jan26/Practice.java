package jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("shivakesav.46");
		driver.findElement(By.xpath("//button[@type='button']//div[@class='VfPpkd-RLmnJb']"));
		String expected = "identifier";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
				{
			System.out.println("Gmail success:::"+"     "+expected+"   "+actual);
		         }
		else
		{
			System.out.println("Gmail not sucess:::"+"     "+expected+"   "+actual);
        
		}
		driver.close();



	}

}
