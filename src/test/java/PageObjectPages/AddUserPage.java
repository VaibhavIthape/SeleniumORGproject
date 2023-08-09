package PageObjectPages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import Utils.GenericUtils;
import Utils.TextContext;

public class AddUserPage {

	public WebDriver driver;
	TextContext Tcon;

	public AddUserPage(WebDriver driver) {
		this.driver = driver;
	}

	private By TakeNameAfterlogin = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
	private By Admin = By.xpath("//span[contains(@class, 'oxd-main-menu-item--name')][text()='Admin']\r\n");
	private By AddUserbtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	private By User_Role = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
	private By Employee_name = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
	private By Status = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	private By Username = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
	private By Password = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	private By ConfirmPassword = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	private By SaveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");

	public void AddNewUser(String Role, String E_Name, String Status1, String Username1, String Password1,
			String ConfirmPassword1) throws InterruptedException {

		// Select select=new Select(driver.findElement(Status));
		WebElement TakeName = driver.findElement(TakeNameAfterlogin);
		String name2 = TakeName.getText();
		WebElement UserRole = driver.findElement(User_Role);
		WebElement EmpName = driver.findElement(Employee_name);
		WebElement Stat = driver.findElement(Status);
		WebElement Uname = driver.findElement(Username);
		WebElement Pass = driver.findElement(Password);
		WebElement ConPass = driver.findElement(ConfirmPassword);
		WebElement Savebtn=driver.findElement(SaveButton);

		GenericUtils.waitforelement(User_Role);

		UserRole.click();
		By UserRole1 = By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/");
		driver.findElement(UserRole1).click();

		GenericUtils.waitforelement(Employee_name);
		EmpName.sendKeys(name2);
		By EmpName2 = By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div");
		GenericUtils.waitforelement(EmpName2);
		Thread.sleep(2000);
		driver.findElement(EmpName2).click();

		GenericUtils.waitforelement(Status);
		Stat.click();
		By status1 = By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]");
		GenericUtils.waitforelement(status1);
		driver.findElement(status1).click();

		GenericUtils.waitforelement(Username);
		Uname.sendKeys(Username1);

		Pass.sendKeys(Password1);

		ConPass.sendKeys(ConfirmPassword1);
		GenericUtils.waitforelement(SaveButton);
		Savebtn.click();
		Thread.sleep(10000);
	

	}

	public void Click() {
		WebElement Savebtn = driver.findElement(SaveButton);
		Savebtn.click();
	}

	public void Redirect() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(Admin).click();
		Thread.sleep(2000);
		driver.findElement(AddUserbtn).click();

	}

}
