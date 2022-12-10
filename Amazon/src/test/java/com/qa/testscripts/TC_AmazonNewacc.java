package com.qa.testscripts;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.AmazonNewUser;

	public class TC_AmazonNewacc extends TestBase{
		AmazonNewUser anu;
		@Parameters({"Browser","Url"})
		@Test
		public void Search(String Browser,String Url) throws InterruptedException
		{
			anu=new AmazonNewUser(Driver);
			anu.Signin().click();
			anu.Newacc().click();
			anu.Name().sendKeys("Soniya");
			Thread.sleep(5000);
			anu.num().sendKeys("5678876543");
			Thread.sleep(5000);
			anu.Emailrnum().sendKeys("soniyateddy9791@gmail.com");
			Thread.sleep(5000);
			anu.Password().sendKeys("sonuroi88");
			Thread.sleep(5000);
			
			
		}


	}

