package com.qa.testscripts;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AcademyeduSignup;

public class TC_AcademyeduSignup extends TestBase{
	
	AcademyeduSignup reg;
		@Parameters({"Browser","Url"})
		@Test
		public void Search(String Browser,String Url) throws InterruptedException
		{
			reg=new AcademyeduSignup(Driver);
			reg.signuplink().click();
			Thread.sleep(2000);
			reg.fname().sendKeys("soniya");
			Thread.sleep(3000);
			reg.lname().sendKeys("g");
			Thread.sleep(3000);
			reg.email().sendKeys("soniyateddy9791@gmail.com");
			Thread.sleep(3000);
			reg.password().sendKeys("Soniya@97");
			
		}
}
