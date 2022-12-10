package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademyeduSignup {
	WebDriver Driver;
	
	@FindBy(xpath="//body/div[@id='site']/div[@id='content']/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/a[1]")
	           
	WebElement signuplink;
	public WebElement signuplink() {
		return signuplink;
	}
	@FindBy(xpath="//*[@id=\"user_first_name\"]")
	WebElement fname;
	public WebElement fname() {
		return fname;
	}
	
	@FindBy(xpath="//*[@id=\"user_last_name\"]")
	WebElement lname;
	public WebElement lname() {
		return lname;
	}
	@FindBy(xpath="//*[@id=\"user_email\"]")
	WebElement email;
	public WebElement email() {
		return email;
	}
	@FindBy(xpath="//*[@id=\"user_password\"]")
	WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="//*[@id=\"register_button\"]")
	WebElement signup;
	public WebElement signup() {
		return signup;
	}
	
	public AcademyeduSignup(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
}

