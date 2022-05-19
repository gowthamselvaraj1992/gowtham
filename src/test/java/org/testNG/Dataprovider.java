package org.testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver driver;
	@BeforeMethod
	
	private void beforemethod() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("facebook.com/login/");

	}

	@Test(dataProvider = "getdata")
	
	private void tc0(String s,String s2) {
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		txtusername.sendKeys(s);
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		
		txtpassword.sendKeys(s2);

	}
	
	@DataProvider(name="getdata")
	
	private Object[][]getdata(){
		
		Object[][] data = new Object[3][2];
		data[0][0] = "gowtham";
		data[0][1] = "selvsrj";
		data[1][0] = "ganapathy";
		data[1][1] = "jayasree";
		data[2][0] = "iswarya";
		data[2][1] = "gowthqyh";
				
		return data;
	}
}
