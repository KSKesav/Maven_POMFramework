package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Emppage {
	WebDriver driver;
	public Emppage(WebDriver driver)
	{
		this.driver = driver;
	}
@FindBy(id = "menu_pim_viewPimModule")
WebElement clickpim;
@FindBy(name = "btnAdd")
WebElement clickadd;
@FindBy(xpath = "//input[@id='firstName']")
WebElement fname;
@FindBy(xpath = "//input[@id='lastName']")
WebElement lname;
@FindBy(xpath ="//input[@id='btnSave']")
WebElement clicksave;
@FindBy(xpath = "//input[@id='photofile']")
WebElement choosefile;
public void verifyEmp(String fname, String lname)throws Throwable
{
	Actions ac = new Actions(driver);
	ac.moveToElement(clickpim).click().perform();
	Thread.sleep(5000);
	ac.moveToElement(clickadd).click().perform();
	Thread.sleep(5000);
	this.fname.sendKeys(fname);
	this.lname.sendKeys(lname);
	//ac.moveToElement(choosefile).click().perform();
	//Runtime.getRuntime().exec("");
	//Thread.sleep(5000);
	this.clicksave.click();
	Thread.sleep(5000);
	
}
}
