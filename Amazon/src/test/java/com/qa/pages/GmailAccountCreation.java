package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailAccountCreation {

	WebDriver driver;
	  @FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
	  WebElement gmail;
	  public WebElement gmail()
	  {
		  return gmail;	  
	  }
	  
	  @FindBy(xpath="/html/body/header/div/div/div/a[3]/span[2]")
	  WebElement createacc;
	  public WebElement createacc()
	  {
		  return createacc;	  
	  }
	  @FindBy(xpath="//*[@id=\"firstName\"]")
	  WebElement fname;
	  public WebElement fname()
	  {
		  return fname;	  
	  }
	  @FindBy(xpath="//*[@id=\"lastName\"]")
	  WebElement lname;
	  public WebElement lname()
	  {
		  return lname;	  
	  }
	  @FindBy(xpath="//*[@id=\"username\"]")
	  WebElement username;
	  public WebElement username()
	  {
		  return username;	  
	  }
	  @FindBy(xpath="//*[@id=\"passwd\"]/div[1]/div/div[1]/input")
	  WebElement pass;
	  public WebElement pass()
	  {
		  return pass;	  
	  }
	  @FindBy(xpath="//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")
	  WebElement conpass;
	  public WebElement conpass()
	  {
		  return conpass;	  
	  }
	  @FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")
	  WebElement showpass;
	  public WebElement showpass()
	  {
		  return showpass;	  
	  }
	  @FindBy(xpath="//*[@id=\"accountDetailsNext\"]/div/button/span")
	  WebElement next;
	  public WebElement next()
	  {
		  return next;	  
	  }
	    public GmailAccountCreation(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
}
