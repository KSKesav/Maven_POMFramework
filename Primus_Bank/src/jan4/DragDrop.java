package jan4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args)throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collections of frames
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames::"+frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).perform();
		if(dst.getText().contains("Dropped"))
		{
			System.out.println("Drag and Drop Sucess::"+dst.getText());
		}
		else
		{
			System.out.println("Drag and Drop Fail::"+dst.getText());
		}
		//come out of frames
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//click on button link in main html page
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		
		
		
	}

}
