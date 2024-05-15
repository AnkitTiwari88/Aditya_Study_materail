package mainproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	//Constructors
	
	LandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	
	//Locators
	
	@FindBy(xpath="//div[@id='O365_UniversalMeContainer']")WebElement profile_btn;

}
