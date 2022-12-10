package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonDrop {
	WebDriver driver;
	  @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	  WebElement searchbox;
	  public WebElement getSearchBoxfield()
	  {
		  return searchbox;	  
	  }
	  @FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]")
	  List<WebElement> AllItems;
	  
	  public List<WebElement> getAllItems(){
	      return AllItems;
	  }
	    public AmazonDrop(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
	

}
