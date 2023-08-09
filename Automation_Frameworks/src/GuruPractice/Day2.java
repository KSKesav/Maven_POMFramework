package GuruPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {
	
	public static void main(String[] args)throws Throwable {
	String baseurl = Util.Base_URL;
	
	WebDriver driver = new FirefoxDriver();
	
	
	driver.get(baseurl);
	
	driver.manage().timeouts().implicitlyWait(Util.Wait_Time, TimeUnit.SECONDS);
	
	

}

}