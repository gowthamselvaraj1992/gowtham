package org.baseclass;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSample {

	public static WebDriver driver;

	public static void  Browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void  launchUrl(String url) {
		driver.get(url);
	}

	public static void  getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void  windowMax() {
		driver.manage().window().maximize();

	}

	public static void  windowmin() {
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(500, 500);
		driver.manage().window().setSize(d);

	}
	public static WebElement  locatorId(String id) {
		WebElement element1 = driver.findElement(By.id(id));
		return element1;

	}
	public static WebElement locatorName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;

	}
	public static void sendkeys(WebElement refname,String value) {
		refname.sendKeys(value);

	}
	public static void click(WebElement refName) {
		refName.click();

	}
	private static void navTo(String url) {
		driver.navigate().to(url);

	}
	private static void navBack() {
		driver.navigate().back();

	}
	private void navFor() {
		driver.navigate().forward();

	}
}
