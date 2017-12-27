package com.samplemavenproject.SimpleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class TestExecution {
	public WebDriver driver;
	Loginpage obj;
	EditEmployee  ee;
	HomePage hp;
	AddEmployee ae;
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/index.php");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj = new Loginpage(driver);
		hp = new HomePage(driver);
		ee=new EditEmployee(driver);
		ae=new AddEmployee(driver);
		
	}

	@Test (priority=1)
	public void Login() {
		obj.fillUserName("qaplanet1");
		obj.fillPassword("lab1");
		obj.clickLogin();
	}

	@Test(priority=2)
	public void Home() throws InterruptedException {
		hp.moveToPIM();
		hp.clickAddEmployee();
		ae.iframe();
		ae.fillLastName("Juno");
		ae.fillFirstName("laxmi");
		ae.clicksave();
		Thread.sleep(3000);
	//	ee.clickEdit();
		//ee.selectDateFromCalendar();
	//	ee.clickSave();
	}
	@Test(priority=3)
public void Employeeedit() 
{
		/*try {
		this.Home();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	ee.clickEdit();
	ee.selectDateFromCalendar();
	ee.clickSave();
}
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
