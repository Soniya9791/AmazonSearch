package com.qa.testscripts;

	import org.openqa.selenium.Keys;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import com.qa.pages.Acadamyedulogin;
public class TC_Academyedulogin extends TestBase {
	Acadamyedulogin log;
		@Parameters({"Browser","Url"})
		@Test
		public void Search(String Browser,String Url) throws InterruptedException
		{
			log=new Acadamyedulogin(Driver);
			log.loginlink().click();
			Thread.sleep(3000);
			log.email().sendKeys("soniyateddy9791@gmail.com");
			Thread.sleep(3000);
			log.password().sendKeys("Soniya@97");
			Thread.sleep(3000);
			log.login().click();
		}

	}

