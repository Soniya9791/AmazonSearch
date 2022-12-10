package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.GooglePages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_GoogleSearch {

     @Test
	 public void SearchGoogle() throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GooglePages GoogleOR=new GooglePages(driver);
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("The Page landed in:"+title);
		GoogleOR.getSearchBoxfield().sendKeys("selenium");
		 Thread.sleep(3000);
		List<WebElement> AllItems =GoogleOR.getAllItems();
		Thread.sleep(2000);
		System.out.println("Total no. of items loaded are : " + AllItems.size());
		 Thread.sleep(3000);
		for(WebElement item: AllItems) {
			System.out.println(item.getText());
		}
		
		driver.close();
	}

}