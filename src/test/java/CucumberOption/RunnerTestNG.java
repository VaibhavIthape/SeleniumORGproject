package CucumberOption;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature",glue="StepDefination",
tags= "@Sanity",
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"}
)


public class RunnerTestNG extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}