package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Register;

public class TC_AmazonSignin extends TestBase{
	Register reg;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
		reg=new Register(Driver);
		reg.Signin().click();;
		reg.Email().sendKeys("9791966567");
		reg.Contne().click();;
		//Thread.sleep(5000);
		reg.Password().sendKeys("sonuroi88");
		reg.Signbt().click();
		
	}


}
