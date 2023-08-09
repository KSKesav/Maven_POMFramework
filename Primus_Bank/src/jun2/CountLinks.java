package jun2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountLinks {

	public static void main(String[] args)throws Throwable{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.myntra.com");
		//WebElement menu = driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]"));
		//WebElement tsht = driver.findElement(By.xpath("//*[@class='desktop-categoryLink'][1]"));
		 driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//Actions ac = new Actions(driver);
		//ac.moveToElement(menu).build().perform();
		//ac.click();
		//driver.findElement(By.xpath("//*[@class='desktop-categoryLink'][1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//picture[@class='img-responsive'])[2]")).click();
		/* List<WebElement> links = driver.findElements(By.tagName("img"));
		 System.out.println("no of links are:::" + links.size());
		 for(WebElement each : links)
		 {
			 String linkname = each.getText();
			 System.out.println(linkname);
		 }
		*/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/picture[1]")));
		WebElement tsht = driver.findElement(By.xpath(("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/picture[1]")));
		tsht.click();
		

	}

}
