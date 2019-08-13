package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	WebDriver driver;
	//By username = By.xpath("//input[@name='login']");
	//By pwd = By.xpath("//input[@name= 'passwd']");
	//By singIn = By.xpath("//input[@type='submit']");
	
	@FindBy(xpath= "//input[@name='login']")
	WebElement username;
	
	@FindBy(xpath= "//input[@name= 'passwd']")
	WebElement pwd;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement singIn;
	
	@FindBy(linkText = "Home")
	WebElement home;
	
	public LoginPagePF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement UserName()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return pwd;
	}
	
	public WebElement SignIn()
	{
		return singIn;
	}
	
	public WebElement Home()
	{
		return home;
	}
}
