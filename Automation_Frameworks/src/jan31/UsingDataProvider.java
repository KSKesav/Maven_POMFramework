package jan31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ApplicationLayer.LoginPage;

public class UsingDataProvider
{
	WebDriver driver;
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Selenium\\Automation_Frameworks\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(dataProvider = "supplydata")
	public void verifyLogin(String username, String password)
	{
		driver.manage().deleteAllCookies();

		driver.get("http://orangehrm.qedgetech.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyLogin(username, password);

		String expected ="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";

		String actual =driver.getCurrentUrl();

		try {

			Assert.assertEquals(actual, expected,"Login Fail");

		}catch(Throwable t)

		{

			System.out.println(t.getMessage());

		}

	}

	@DataProvider
	public Object[][] supplydata() 
	{
		Object login [][]= new Object[4][2];

		login[0][0]="Admin";

		login[0][1]="Qedge123!@#";

		login[1][0]="Admin";

		login[1][1]="Qedge123!";

		login[2][0]="Admin1";

		login[2][1]="Qedge123!@#";

		login[3][0]="Admin";

		login[3][1]="Qedge123!@#";

		return login;

	}


	@AfterTest
	public void afterTest() 
	{
		driver.close();
	}

}
