package generalComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestBase.testBase;
import junit.framework.Assert;
import pom.POM_LoginPage;
import utilities.GetProperty;

public class Registration {
	WebDriver driver;
	String url;
	POM_LoginPage pomLogin;
	public Registration(WebDriver wd)
	{
		this.driver = wd;
	}
	
	public void launchPage() throws Exception
	{
		driver = testBase.initDriver();
		pomLogin = new POM_LoginPage(driver);
		url = GetProperty.getProp("AUT");
		driver.get(url);
		pomLogin.uid.sendKeys("sss@gg.com");
		pomLogin.enter.click();
		Assert.assertEquals("Automation Demo Site", pomLogin.head1.getText().trim());
		
	}
	
	
	
}
