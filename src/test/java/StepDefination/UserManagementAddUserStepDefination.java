package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObjectPages.AddUserPage;
import PageObjectPages.LoginPage;
import Utils.TextContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserManagementAddUserStepDefination {

	WebDriver driver;
	TextContext Tcon;
	AddUserPage adduserpage;
	LoginPage loginpage;

	public UserManagementAddUserStepDefination(TextContext Tcon) {
		this.Tcon = Tcon;
		this.adduserpage = Tcon.pageobjectmanager.getAdduserpage();
		this.loginpage = Tcon.pageobjectmanager.getLoginPage();

	}

	@Then("Redirect to Add User page")
	public void Redirect_to_Add_User_page() throws InterruptedException {

		adduserpage.Redirect();

	}

	@Then("Fill all mandatory fields {string} {string} {string} {string} {string} and {string}")
	public void enter_mandatory_fields_and(String string, String string2, String string3, String string4,
			String string5, String string6) throws InterruptedException {

		adduserpage.AddNewUser(string, string2, string3, string4, string5, string6);
	}

}
