package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.GetProperty;
public class testBase {
	public static WebDriver driver;
	static GetProperty getProp;
	public static WebDriver initDriver() throws Exception
	{
		String propName;
		getProp = new GetProperty();
		propName = getProp.getProp("browser");
		if (propName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/edksuresh/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
}
