package org.com.mavenPr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fTest {
	@Test
	public void login() {
	
		System.out.println("login");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Hello Swapnali");
	}

}

