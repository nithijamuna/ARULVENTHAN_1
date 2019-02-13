package com.test1.tests;



import java.util.concurrent.TimeUnit;

import net.bytebuddy.matcher.MethodSortMatcher.Sort;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyaccountpageTest {
	
	
  @Test
		 public static void Test2()
		 
		 {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arul\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("arul");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();
		

		
		
		 }
  }
