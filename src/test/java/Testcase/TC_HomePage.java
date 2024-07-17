package Testcase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import Resource.Base;

public class TC_HomePage extends Base {

	// WebDriver driver;

	@Test

	public void HomePageNavigation() throws InterruptedException {

		// Auto Suggestion Select=========================

		Thread.sleep(2000);
		HP.AutoDropdownClick("Ind");
		log.info("Auto Suggestion Select");

		// Drop down FROM City Select =========================

		Thread.sleep(2000);
		HP.DropdownFROM();
		log.info("Dropdown select");

		HP.ItemSelectFROM();
		log.info("City Selected");

		// Drop down TO City Select=============================

		Thread.sleep(2000);
		HP.DropdownTO();
		log.info("Dropdown selected");
		Thread.sleep(2000);
		HP.ItemSelectTO();
		log.info("Destination select");

		// One Way Radio Button=======================================
		Thread.sleep(2000);
		HP.OneWayRadioButton();
		log.info("One way Radio Button selected");

		Thread.sleep(2000);
		HP.DepaCalenderClick();
		log.info("Cal Click");

		Thread.sleep(2000);
		HP.DateSelected();
		log.info("Date Select");

		// Round Way Radio Button =========================================

		Thread.sleep(2000);
		HP.RoundWayRadioButton();
		log.info("Round way Radio Button Select");

		Thread.sleep(2000);
		HP.DepaCalenderClick();
		log.info("Cal Click");

		Thread.sleep(2000);
		HP.NextBtnClick();
		log.info("Next Click");

		Thread.sleep(2000);
		HP.RoundDateSelected();
		log.info("Round Date Select");

		Thread.sleep(2000);
		HP.ReturnCalenderClick();
		log.info("Return Cal Click");

		Thread.sleep(2000);
		HP.RoundReturnDateSelected();
		log.info("Return Cal Click");

		// Passenger Select============================================
		HP.SelectDropdownItem();
		log.info("PassDropdown Item Selected");
		Thread.sleep(2000);

		HP.AddItem();
		log.info("Item Add");

		HP.ClickOnDone();
		log.info("Done button");

		// Currency Select==================================================

		HP.SetDropdown();
		log.info("Dropdown Item Selected");
		Thread.sleep(2000);

		// Checkbox Selected

		HP.CheckboxCitizen();
		log.info("Checkbox selected");
		Thread.sleep(2000);

		// Multicites Radio Button

		HP.MulticitiesRadioButton();
		log.info("Multicities selected");
		Thread.sleep(3000);

		HP.Alert();
		Thread.sleep(2000);
		//Hotel Page
		HP.HotelHome();
		Thread.sleep(3000);

	}
}
