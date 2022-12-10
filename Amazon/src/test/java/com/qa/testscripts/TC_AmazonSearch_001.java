package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonSearch_001 extends TestBase
{
	AmazonPages amzpages;
@Parameters({"Browser","Url"})
@Test
public void Search(String Browser,String Url) throws InterruptedException
{
	amzpages=new AmazonPages(Driver);
	amzpages.SearchBox().sendKeys("Da Vince Code");
	amzpages.SearchButton().click();
	Thread.sleep(5000);
	String title=Driver.getTitle();
	
	if(title.contains("Da Vince Code"))
		System.out.println("User Landed on Da Vince Code page");
	else
		System.out.println("User Landed on Da Vince Code page");
}

}