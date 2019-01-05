package com.learning.com.test;

import org.testng.annotations.Test;

public class LaunchGoogle {
	
	LaunchBrowser lb = new LaunchBrowser();
	
	@Test
	public void TestCase1() {
		lb.launchBrowsr("Chrome", "https://www.rediff.com/");
	}
	
	

}
