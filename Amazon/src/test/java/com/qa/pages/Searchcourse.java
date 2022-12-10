package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchcourse {
	WebDriver Driver;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div[1]/div/div[2]/a")
	WebElement loginlink;
	public WebElement loginlink() {
		return loginlink;
	}
	@FindBy(xpath="//*[@id=\"login-modal-email-input\"]")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(xpath="//*[@id=\"login-modal-password-input\"]")
	WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="//*[@id=\"js-for-recaptcha--login-form\"]/div[3]/div[2]/input")
	WebElement login;
	public WebElement login() {
		return login;
	}	
	//@FindBy(xpath="//body/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")

	@FindBy(xpath="/html/body/div[7]/div[2]/div/div/div/div[1]/div/div/input ")
	             
	WebElement search;
	public WebElement search() {
		return search;
	}
	@FindBy(xpath="/html")
	WebElement page;
	public WebElement page() {
		return page;
	}
	
	

	public Searchcourse(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}

}
