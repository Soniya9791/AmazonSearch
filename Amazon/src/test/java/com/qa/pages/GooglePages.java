package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages 
{
  WebDriver driver;
  @FindBy(name="q")
  WebElement searchbox;
  public WebElement getSearchBoxfield()
  {
	  return searchbox;	  
  }
  @FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]")
  List<WebElement> AllItems;
  
  public List<WebElement> getAllItems(){
      return AllItems;
  }
    public GooglePages(WebDriver driver)
  {
   this.driver=driver;
   PageFactory.initElements(driver, this);  
  }
}