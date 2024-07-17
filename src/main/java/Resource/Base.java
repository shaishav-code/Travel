package Resource;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageObjects.HomePage;



public class Base {
	 public static Logger log = Logger.getLogger(Base.class.getName());
	 public static WebDriver driver;
	 public HomePage HP;
//	 
	 

	@BeforeTest
	public WebDriver initiDriver() 
	{
		 DOMConfigurator.configure("jar4j2.xml");
		 log.info("this is xml file Configratution");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pgargi\\Chrome\\chromedriver.exe");
			   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Hello World!");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
		
	}
	
	@BeforeClass
	public void objectrepo()
	{
		 HP= new HomePage(driver);
	}
	
	
	
	@AfterTest
	public WebDriver closeDriver() {
		
		
		driver.close();
		log.info("Good bye");
		return driver;
		
	}
	


}

