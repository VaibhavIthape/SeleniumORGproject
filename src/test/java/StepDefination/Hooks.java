package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;

import Utils.TestBase;
import Utils.TextContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class Hooks {
	
	
	WebDriver driver;
	TextContext testContextSetup;
	TestBase testbase;

	public Hooks(TextContext testContextSetup)
	{
		
		this.testContextSetup = testContextSetup;
	}
	
	@After
	public void afterscenario() throws IOException
	{
		testContextSetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws WebDriverException, IOException
	{
		
		WebDriver driver=testContextSetup.testbase.WebDriverManager();
		if(scenario.isFailed())
		{
			//
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] conbyte=FileUtils.readFileToByteArray(file);
		scenario.attach(conbyte,"image/png","failedScree shot");
		}
	}

}
