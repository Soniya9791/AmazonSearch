package com.qa.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonNewUser {


	WebDriver Driver;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement signin;
	public WebElement Signin() {
		return signin;
	}
	@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	WebElement newacc ;
	public WebElement Newacc() {
		return newacc;
	}
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	WebElement name;
	public WebElement Name() {
		return name;
	}
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement emailrnum;
	public WebElement Emailrnum() {
		return emailrnum;
	}
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement password;
	public WebElement Password() {
		return password;
	}
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement num;
	public WebElement num() {
		return num;
	}
	

	public AmazonNewUser(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
	
}

