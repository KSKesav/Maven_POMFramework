package jan5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		//iterate all rows
		for(WebElement eachrow : rows)
		{
			//get collection of columns in each row
			List<WebElement> cols = eachrow.findElements(By.className("dataTable"));
			//iterate columns
			for(WebElement eachcell : cols)
			{
				//capture eachcell text
				String celltext = eachcell.getText();
				System.out.println(celltext+"\t");
				
			}
			System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			Thread.sleep(5000);
			driver.close();
		}
	}

}
