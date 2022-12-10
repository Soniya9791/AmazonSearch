package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.GmailAccountCreation;

public class TC_GoogleAccountCreation extends TestBase {

	GmailAccountCreation gac;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
		gac=new GmailAccountCreation(Driver);
		gac.gmail().click();;
		Thread.sleep(5000);
		gac.createacc().click();;
		Thread.sleep(5000);
		gac.fname().sendKeys("abc");
		Thread.sleep(5000);
		gac.lname().sendKeys("xyz");
		Thread.sleep(5000);
		gac.username().sendKeys("khks");
		Thread.sleep(5000);
		gac.pass().sendKeys("soniya@98");
		Thread.sleep(5000);
		gac.conpass().sendKeys("soniya@98");
		Thread.sleep(5000);
		gac.showpass().click();
		Thread.sleep(5000);
		gac.next().click();
		Thread.sleep(5000);
		
}
}
