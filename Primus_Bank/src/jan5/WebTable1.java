package jan5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		// store table into webelement
		WebElement table = driver.findElement(By.className("dataTable"));
		//get collections of a table that  are stored in tr tag
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows are:::"+rows.size());
		for (int i=1; i<rows.size(); i++)
		{
			//get collection of columns in each row
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Rows no"+i+"    "+"column size:::"+cols.size());
		}
		Thread.sleep(5000);
		driver.close();


	}

}
