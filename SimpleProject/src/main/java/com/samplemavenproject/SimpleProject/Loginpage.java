package com.samplemavenproject.SimpleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpage {
	WebDriver driver;
	@FindBy(name = "txtUserName")
	WebElement username;
	@FindBy(xpath = "//input[@name='txtPassword']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillUserName(String userName) {
		this.username.sendKeys(userName);

	}

	public void fillPassword(String password) {
		this.password.sendKeys(password);

	}

	public void clickLogin() {
		this.Login.submit();

	}

}
