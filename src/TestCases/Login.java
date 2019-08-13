package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.LoginPagePF;

public class Login {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//LoginPage rd = new LoginPage(driver);
		LoginPagePF rd = new LoginPagePF(driver);
		rd.UserName().sendKeys("userId");
		rd.Password().sendKeys("password");
		rd.SignIn().click();
		rd.Home().click();
	}
}
