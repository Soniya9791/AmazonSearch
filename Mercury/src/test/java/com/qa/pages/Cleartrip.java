package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cleartrip {

	
	WebDriver Driver;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button/div/div/span")
	 public static WebElement trip;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[1]/div/div/span")
	 public static WebElement drop;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
	 public static WebElement Class;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button/div/div/span")
	 public static WebElement count;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
	 public static WebElement type;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	 public static WebElement Where;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	 public static WebElement to;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	 public static WebElement drop1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	 public static WebElement drop2;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]")
	 public static WebElement search;
	
	@FindBy(xpath="/html")
	 public static WebElement flightdetails;
	

}
