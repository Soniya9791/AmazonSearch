package com.qa.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage {
	
	WebDriver driver;
	  @FindBy(name="q")
	  WebElement searchbox;
	  public WebElement SearchBoxfield()
	  {
		  return searchbox;	  
	  }
	  
	    public GoogleHomepage(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }

}
