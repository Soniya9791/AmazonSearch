package com.qa.testscripts;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSearch;
import com.qa.utility.ExcelUtility;

public class Tc_amazonpage_01 extends TestBase{



	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		
		String xFile="C:\\Users\\soniy\\eclipse-workspace\\Mercury\\src\\test\\java\\com\\qa\\testdata\\DataAMZN.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
	@Test(dataProvider = "getdata")
	public void getTest(String catagory, String items ) throws IOException, InterruptedException {
	PageFactory.initElements(driver, AmazonSearch.class);
	Thread.sleep(5000);
	/*Amazonpages.gsearchbox.sendKeys("amazon.in"+Keys.ENTER);
	Amazonpages.link.click();*/
	AmazonSearch.selectCatagory.click();
	Select slct=new Select(AmazonSearch.selectCatagory);
	Thread.sleep(5000);
	 slct.selectByVisibleText(catagory);
	 AmazonSearch.amznSearchBox.sendKeys(items+Keys.ENTER);
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);

}
}

