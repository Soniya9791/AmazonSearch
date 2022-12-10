package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver Driver;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement signin;
	public WebElement Signin() {
		return signin;
	}
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement email;
	public WebElement Email() {
		return email;
	}
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement contne;
	public WebElement Contne() {
		return contne;
	}
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement password;
	public WebElement Password() {
		return password;
	}
	@FindBy(xpath="//*[@id=\"auth-signin-button\"]")
	WebElement signbt;
	public WebElement Signbt() {
		return signbt;
	}
	public Register(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
	
}
