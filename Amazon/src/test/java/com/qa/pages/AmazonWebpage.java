package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWebpage {
	WebDriver Driver;
	
	 @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	 WebElement searchbox;
	public WebElement SearchBox()
	 {
		
		  return searchbox;
	 }
	 @FindBy(xpath="//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/div/span")
	 WebElement amazonlink;
	 public WebElement Amazonlink()
	 {
		
		  return amazonlink;
	 }
	 public AmazonWebpage(WebDriver driver)
	  {
	   this.Driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
	

}
