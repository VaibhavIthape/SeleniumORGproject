package StepDefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectPages.LoginPage;
import Utils.TextContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OrangeHRMStepDefination {

	WebDriver driver;
	public TextContext Tcon;
	public LoginPage loginpage;

	public OrangeHRMStepDefination(TextContext Tcon) {
		this.Tcon = Tcon;
		this.loginpage = Tcon.pageobjectmanager.getLoginPage();
	}

	@Given("Open Orange HRM Site")
	public void open_orange_hrm_site() {

		System.out.println("Ok");

	}

	@Given("User Enter Username and Password {string} and {string}")
	public void user_enter_username_and_password_username_and_password(String Uname, String Password) {

		loginpage.SendKey(Uname, Password);

	}

	@When("Click on Login button")
	public void click_on_login_button() {

		// Tcon.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("Verify User redirect on Home page")
	public void verify_user_redirect_on_home_page() throws IOException {

		Tcon.genUtility.TakeScreenShot();

	}

}
