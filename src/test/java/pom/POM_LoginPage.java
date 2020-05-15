package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage {

	public WebDriver driver;
	public POM_LoginPage(WebDriver wd)
	{
		this.driver = wd;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement uid;

	@FindBy(xpath="//img[@id='enterimg']")
	public WebElement enter;
	
	@FindBy(xpath="//h1")
	public WebElement head1;

	@FindBy(xpath="//h1[starts-with(text(),'Automation')]")
	public WebElement headText1;
	
	
}
