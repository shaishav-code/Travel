package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page {



	WebDriver TravelP;
	
	public Landing_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.TravelP=driver;
		 PageFactory.initElements(driver, this);
		 
	}	
}
