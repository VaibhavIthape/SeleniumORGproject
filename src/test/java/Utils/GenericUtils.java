package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.reporter.FileUtil;

import io.cucumber.messages.types.Timestamp;

public class GenericUtils {

	static WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement waitforelement(By locator) {
		FluentWait<WebDriver> Fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		return Fluentwait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public void TakeScreenShot() throws IOException {

		FluentWait<WebDriver> FW = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		FW.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]")));

		TakesScreenshot ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);

		String Filename = "Screenshot_" + timestamp + ".png";
		File Dest = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM_WebSiteCucumber\\target\\Screenshot\\Login" + Filename);

		FileUtils.copyFile(Screenshot, Dest);

	}

}
