package com.learning.com.test;

import org.testng.annotations.Test;

public class LaunchMSN {
	
LaunchBrowser lb = new LaunchBrowser();
	
	@Test
	public void TestCase1() {
		lb.launchBrowsr("IE", "https://www.msn.com/");
	}

}
