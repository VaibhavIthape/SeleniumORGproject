package PageObjectPages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	public AddUserPage adduserpage;
	public LoginPage loginpage;
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public AddUserPage getAdduserpage()
	{
	adduserpage=new AddUserPage(driver);
	return adduserpage;
	}
	
	public LoginPage getLoginPage()
	{
		return loginpage=new LoginPage(driver);
	}
}
