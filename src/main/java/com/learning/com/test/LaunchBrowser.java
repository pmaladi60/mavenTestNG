package com.learning.com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public void launchBrowsr(String browserName, String url) {

		WebDriver driver;
		switch (browserName){

		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		default:
		case "IE":
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\ADMIN\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
					break;
		}

		driver.get(url);
		driver.getTitle();
		
		
		
		
		driver.close();

	}

	
}
