package com.samplemavenproject.SimpleProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Program1 {
	
	
  @Test
  public void firstmethod() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://apps.qaplanet.in/qahrm/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@value='Login']")).submit();
  }
 
}
