package dec28;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyTitles {
		String expected;
		String actual;
		WebDriver driver;
		

		public  void Capturetitle( ) throws Throwable
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https;//google.com");
			Thread.sleep(5000);
			expected = "google";
			//get title in run time
			actual = driver.getTitle();
			if(actual.equalsIgnoreCase(expected));
			{
				System.out.println("Title is matching:::"+expected+ "    "+ actual);
				}
			{
				System.out.println("Title is not  matching:::"+expected+ "    "+ actual);
				
			}
			driver.close();
			}

	public static void main(String[] args)throws Throwable {
		VerifyTitles a = new  VerifyTitles();
		a.Capturetitle();

	}

}
