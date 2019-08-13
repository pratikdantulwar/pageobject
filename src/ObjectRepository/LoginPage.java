package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	By username = By.xpath("//input[@name='login']");
	By pwd = By.xpath("//input[@name= 'passwd']");
	By singIn = By.xpath("//input[@type='submit']");
	By home = By.linkText("Home");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement UserName()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(singIn);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
