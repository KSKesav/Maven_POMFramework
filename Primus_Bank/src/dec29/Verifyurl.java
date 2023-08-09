package dec29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurl {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		Thread.sleep(5000);
		String expected = "https://";
		//get complete url in run time
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("url is secured::::"+expected+"    "+actual);
		}
		else
		{
			System.out.println("url is not secured::::"+expected+"    "+actual);
		}
		driver.close();
	}

}
