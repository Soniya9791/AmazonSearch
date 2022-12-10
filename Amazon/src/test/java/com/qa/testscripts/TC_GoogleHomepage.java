package com.qa.testscripts;

import org.openqa.selenium.Keys;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.qa.pages.GoogleHomepage;

@Test
public class TC_GoogleHomepage extends TestBase {

	GoogleHomepage ghp;
	@Parameters({"Browser","Url"})
	public void Search(String Browser,String Url) throws InterruptedException
	{
		ghp=new GoogleHomepage(Driver);
		ghp.SearchBoxfield().sendKeys("google",Keys.ENTER);
		String title= Driver.getTitle();
		System.out.println(title);
		
		
	
	}
}
