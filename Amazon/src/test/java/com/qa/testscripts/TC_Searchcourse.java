package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Searchcourse;

public class TC_Searchcourse extends TestBase{
	Searchcourse sc;
	@Parameters({"Browser","Url"})
	@Test
	
	public void Search(String Browser,String Url) throws InterruptedException
	{
		sc=new Searchcourse(Driver);
		Thread.sleep(3000);
		sc.loginlink().click();
		Thread.sleep(3000);
		sc.email().sendKeys("soniyateddy9791@gmail.com");
		Thread.sleep(3000);
		sc.password().sendKeys("Soniya@97");
		Thread.sleep(3000);
		sc.login().click();
		Thread.sleep(3000);
		sc.search().sendKeys("Automation Testing",Keys.ENTER);
		Thread.sleep(3000);
		String pagecontent=sc.page().getText();
		System.out.println(pagecontent);
	}
}
