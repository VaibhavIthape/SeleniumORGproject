package PageObjectPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Username=By.xpath("//input[@name=\"username\"]");
	
	By Password=By.xpath("//input[@name=\"password\"]");
	
	By LoginBtn=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	

	public void SendKey(String Uname,String Password1) {
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(Username).sendKeys(Uname);
	 driver.findElement(Password).sendKeys(Password1);
	 driver.findElement(LoginBtn).click();
	}
	
	
}
