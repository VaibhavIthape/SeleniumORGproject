package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectPages.PageObjectManager;

public class TextContext {
	
	
	public WebDriver driver;
	public PageObjectManager pageobjectmanager;
	public GenericUtils genUtility;
	public TestBase testbase;
	
	public TextContext() throws IOException
	{
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
		genUtility=new GenericUtils(testbase.WebDriverManager());
		
	}
	
	
	
	 

}
