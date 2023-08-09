package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//define Repositary
	@FindBy(name="txtUsername")
	WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	//write method for login
	public void verifyLogin(String username , String password)
	{
		Actions ac = new Actions(driver);
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		ac.moveToElement(loginbtn).click().perform();
		}
	

}
