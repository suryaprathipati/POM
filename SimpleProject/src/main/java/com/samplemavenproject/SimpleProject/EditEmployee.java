package com.samplemavenproject.SimpleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployee {
	WebDriver driver;
	//edit
	//@FindBy(id="btnEdit")
	@FindBy(id="btnEditPers")
	WebElement edit;
	//date
	@FindBy(className="calendarBtn")
	WebElement calendarbutton;
	//calendar
	@FindBy (linkText ="20")
	WebElement date;
	//save
	@FindBy(id="btnEditPers")
	WebElement save;

	public EditEmployee (WebDriver driver)
	{
		this.driver =driver ;
	PageFactory .initElements(driver, this);
			
	}
	public void clickEdit()
	{
		edit.click();
	}
	public void selectDateFromCalendar()
	{
	calendarbutton .click();
		date.click();
		
	}
	public void clickSave()
	{
		save .click();
	}
}
