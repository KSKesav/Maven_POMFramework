package dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class Browser1 {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation_Selenium\\Primus_Bank\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.switchTo().alert().accept();
		// Actions ac = new Actions(driver);
		//ac.moveToElement(driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/a[1]/i[1]"))).click().perform();
		driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		// driver.close();
		driver.quit();
	}

}
