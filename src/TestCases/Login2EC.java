package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.LoginPageEC;
import ObjectRepository.LoginPagePF;

public class Login2EC {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.26.62.18:9090/");
		//LoginPage rd = new LoginPage(driver);
		LoginPageEC rd = new LoginPageEC(driver);
		rd.UserName().sendKeys("554");
		rd.Password().sendKeys("Test@123");
		rd.SignIn().click();
		//rd.Home().click();
	}
}
