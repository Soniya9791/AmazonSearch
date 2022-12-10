package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Acadamyedulogin {
		WebDriver Driver;
		
		@FindBy(xpath="/html/body/div[8]/div[1]/div[1]/div/div[1]/div/div[2]/a")
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
		

		public Acadamyedulogin(WebDriver Driver) {
			this.Driver=Driver;
			PageFactory.initElements(Driver,this);
		}
	}

