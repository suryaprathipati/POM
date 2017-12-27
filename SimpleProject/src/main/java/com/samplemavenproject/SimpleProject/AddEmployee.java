package com.samplemavenproject.SimpleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
	WebDriver driver;
	// FRAME
	@FindBy(id = "rightMenu")
	WebElement iframe;
	// lastname
	@FindBy(id = "txtEmpLastName")
	WebElement lastname;
	// firstname
	@FindBy(name="txtEmpFirstName")
	WebElement firstname;
	// save
	@FindBy(id = "btnEdit")
	WebElement save;

	public AddEmployee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void iframe() {
		this.driver.switchTo().frame(iframe);
	}

	public void fillLastName(String lastName) {
		this.lastname.sendKeys(lastName);

	}

	public void fillFirstName(String firstName) {
		this.firstname.sendKeys(firstName);
	}

	public void clicksave() {
		this.save.click();
	}
}
