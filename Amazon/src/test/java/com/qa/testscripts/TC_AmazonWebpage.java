package com.qa.testscripts;

import org.openqa.selenium.Keys;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonWebpage;


public class TC_AmazonWebpage extends TestBase{

	AmazonWebpage awp;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
		
		awp=new AmazonWebpage(Driver);
		awp.SearchBox().sendKeys("amazon",Keys.ENTER);
		Thread.sleep(5000);
		awp.Amazonlink().click();
		String title=Driver.getTitle();
		System.out.println(title);
		
	
	}
}

