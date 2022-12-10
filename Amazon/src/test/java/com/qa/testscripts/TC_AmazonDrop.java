package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonDrop;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonDrop extends TestBase {
	AmazonDrop amd;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("The Page landed in:"+title);
		amd=new AmazonDrop(Driver);
		amd.getSearchBoxfield().sendKeys("handbag");
		Thread.sleep(3000);
		List<WebElement> AllItems =amd.getAllItems();
		Thread.sleep(2000);
		System.out.println("Total no. of items loaded are : " + AllItems.size());
		 Thread.sleep(3000);
		for(WebElement item: AllItems) {
			System.out.println(item.getText());
		}
		
		driver.close();
	}
		
		
		
	}

