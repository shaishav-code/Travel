package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// currency dropdown===========================================================================
	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement SelectDropDown;

	public void SetDropdown() {

		Select dropdown = new Select(SelectDropDown);

		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

	// item add in dropdown==============================================================================

	@FindBy(xpath = "//div[@id='divpaxinfo']")
	WebElement SelectDropDownPass;

	public void SelectDropdownItem() {

		SelectDropDownPass.click();
	}

	@FindBy(id = "hrefIncAdt")
	WebElement AddButton;

	public void AddItem() {
		for (int i = 1; i < 5; i++) {

			AddButton.click();

		}
	}

	// Done Button=====================================================================================

	@FindBy(id = "btnclosepaxoption")
	WebElement btnclick;

	public void ClickOnDone() {
		btnclick.click();
	}

	// Dynamic DropDown FROM======================================================================

	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement DropDownFROMClick;

	public void DropdownFROM() {

		DropDownFROMClick.click();
	}

	@FindBy(xpath = "//a[@value='MAA']")
	WebElement SelectDropdownFrom;

	public void ItemSelectFROM() {
		SelectDropdownFrom.click();
	}

	// Dynamic DropDown TO==========================================================================

	@FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement DropDownTOClick;

	public void DropdownTO() {

		DropDownTOClick.click();
	}

	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")
	WebElement SelectDropdownTO;

	public void ItemSelectTO() {
		SelectDropdownTO.click();
	}

	// Handling AutoSuggestive dropdowns using Selenium=====================================================

	@FindBy(id = "autosuggest")
	WebElement AutoClick;

	public void AutoDropdownClick(String itemclick) throws InterruptedException {
		AutoClick.click();
		AutoClick.sendKeys(itemclick);
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[2]/a"));

		for (WebElement option : options) {
			if (option.getText().equals("India")) {
				option.click();
				break;
			}

		}
	}

	// Checkbox  selected==================================================================================

	@FindBy(id = "ctl00_mainContent_chk_SeniorCitizenDiscount")
	WebElement citizenCheckbox;

	public void CheckboxCitizen() {
		citizenCheckbox.click();
		Boolean status = citizenCheckbox.isSelected();
		System.out.println(status);
	}

	// One Way Radio button Selected====================================================================

	@FindBy(id = "ctl00_mainContent_rbtnl_Trip_0")
	WebElement OneWayRB;

	public void OneWayRadioButton() {
		OneWayRB.click();

	}

	// ***********Departure Cal Click*********************

	@FindBy(id = "ctl00_mainContent_view_date1")
	WebElement DepacalClick;

	public void DepaCalenderClick() {
		DepacalClick.click();
	}

	// ***********Departure Date Select*********************

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//div[2]/table/tbody/tr[3]/td[5]/a")
	WebElement DateSelect;

	public void DateSelected() {
		DateSelect.click();
	}

	// Round Way Radio button Selected====================================================================

	@FindBy(id = "ctl00_mainContent_rbtnl_Trip_1")
	WebElement RoundWayRB;

	public void RoundWayRadioButton() {
		RoundWayRB.click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is Disable");
		} else {
			System.out.println("is Enable");
		}
	}

	// ********Round Way Departure Cal Click*************
	// Same One Way Radio Button Depa Cal Click================DepaCalenderClick()=====

	// ************Next Button Click********

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div[2]/div/a")
	WebElement NextClick;

	public void NextBtnClick() {
		NextClick.click();
	}

	// ********Departure Date Select Round Way*************

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]/a")
	WebElement RoundWayDate;

	public void RoundDateSelected() {
		RoundWayDate.click();
	}

	// **********return date Cal Click**************
	@FindBy(xpath = "//div[@id='Div1']/button")
	WebElement ReturnCalender;

	public void ReturnCalenderClick() {
		ReturnCalender.click();
	}

	//*******Round Way return Date Select******

	@FindBy(xpath = "// div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[6]/a")
	WebElement RoundReturnDate;

	public void RoundReturnDateSelected() {
		RoundReturnDate.click();
	}
	
	//Multicities Radio Button================================
	
		@FindBy(id = "ctl00_mainContent_rbtnl_Trip_2")
		WebElement MulticitiesRB;

		public void MulticitiesRadioButton() {
			MulticitiesRB.click();
		}
		
		@FindBy(id="MultiCityModelAlert")
		WebElement AlertOk;
		
		public void Alert() {
			AlertOk.click();
		}
		
		//Hotel Homepage================================
		
		@FindBy(xpath = "//div[@class='button-align-center']/ul/li[2]/a")
		WebElement Hotel;
		
		public void HotelHome() {
			Hotel.click();
		}
		
		
	
	
	
}
