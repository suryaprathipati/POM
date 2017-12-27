package com.samplemavenproject.SimpleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	Actions act;
	// pim
	@FindBy(xpath = "//li[@id='pim']")
	WebElement PIM;
	// add employee
	@FindBy(xpath = "(//li[@id='pim']//a)[3]")
	WebElement addEmployee;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}

	public void moveToPIM() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(this.PIM));
		act.moveToElement(this.PIM).build().perform();
	}

	public void clickAddEmployee() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(addEmployee));
		act.moveToElement(addEmployee).perform();
		act.click(addEmployee).build().perform();
		
	}
}
