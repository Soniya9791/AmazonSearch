package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.Cleartrip;
import com.qa.utility.ExcelUtility;

public class TC_Cleartrip extends TestBase{
	
	

	@DataProvider(name="getdata")
	public String[][] getData() throws IOException 
	{
		String xFile="C:\\Users\\soniy\\eclipse-workspace\\Mercury\\src\\test\\java\\com\\qa\\testdata\\DATA_trip.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) 
		{
			for(int j=0;j<cellCount;j++) 
			{
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
	}

	@Test(dataProvider = "getdata")
	public void getTest(String Source, String Destination ) throws IOException, InterruptedException, AWTException 
	{
		
	PageFactory.initElements(driver,Cleartrip.class);
	Thread.sleep(6000);
	Cleartrip.Where.click();
	Thread.sleep(4000);
	 Robot robot = new Robot(); 
	 Thread.sleep(2000); 	
     robot.keyPress(KeyEvent.VK_CLEAR);
	Thread.sleep(8000);
	Cleartrip.Where.sendKeys(Source);
	Thread.sleep(15000);
	Cleartrip.drop1.click();
	Thread.sleep(4000);
	Cleartrip.to.click();
	Thread.sleep(4000);
	 robot.keyPress(KeyEvent.VK_CLEAR);
	Thread.sleep(8000);
	Cleartrip.to.sendKeys(Destination);
	Thread.sleep(20000);
	Cleartrip.drop2.click();
	Thread.sleep(8000);
	Cleartrip.search.click();
	Thread.sleep(8000);
	System.out.println(Cleartrip.flightdetails.getText());
	Thread.sleep(6000);
	driver.navigate().back();
    Thread.sleep(8000);

	}


}
