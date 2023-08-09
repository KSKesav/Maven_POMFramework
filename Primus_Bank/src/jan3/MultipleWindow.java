package jan3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//print parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//print all window ids
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		//iterate all windows
		for(String eachwin:allwins)
		{
			//parent window id should not be equal to child ids 
			if(parent.equals(eachwin))
			{
				//switch to each child window return title and close one by one
				String childtitles = driver.switchTo().window(eachwin).getTitle();
				System.out.println(childtitles);
				Thread.sleep(5000);
				driver.close();
			}
			
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifer")).sendKeys("gmail");
		driver.findElement(By.xpath("//button[@type='button']//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
