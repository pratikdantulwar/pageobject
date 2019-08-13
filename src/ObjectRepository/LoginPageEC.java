package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageEC {

	WebDriver driver;
	By username = By.xpath("//input[@id='email']");
	By pwd = By.xpath("//input[@id= 'pwd']");
	By singIn = By.xpath("//button[@id='loadButton']");
	//By home = By.linkText("Home");
	
	public LoginPageEC(WebDriver driver)
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
	
//	public WebElement Home()
	//{
		//return driver.findElement(home);
//	}
}
