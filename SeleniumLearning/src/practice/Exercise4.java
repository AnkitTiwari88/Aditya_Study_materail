package practice;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.support.ui.Select; 

public class Exercise4 {
	
	public static void main(String[] args) throws Exception{
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe"); 
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://www.roboform.com/filling-test-all-fields"); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	 

	WebElement Title = driver.findElement(By.name("01___title")); 

	Title.sendKeys("CSDQEASDET"); 

//			System.out.println("Title is : "+ Title.getText()); 

	 

	Thread.sleep(1000); 

	WebElement FirstName = driver.findElement(By.name("02frstname")); 
	FirstName.sendKeys("Aditya"); 

	Thread.sleep(1000); 

	WebElement MiddleName = driver.findElement(By.name("03middle_i")); 
	MiddleName.sendKeys("NIL"); 

	Thread.sleep(1000); 

	WebElement LastName = driver.findElement(By.name("04lastname")); 
	LastName.sendKeys("Thakur"); 

	Thread.sleep(1000); 
	WebElement FullName = driver.findElement(By.name("04fullname")); 
	FullName.sendKeys("Aditya Thakur"); 

	 

	Thread.sleep(1000); 

	WebElement Company = driver.findElement(By.name("05_company")); 
	Company.sendKeys("Cognizant"); 

	Thread.sleep(1000); 
	WebElement Position = driver.findElement(By.name("06position")); 
	Position.sendKeys("Intern"); 

	Thread.sleep(1000); 
	WebElement Address1 = driver.findElement(By.name("10address1")); 
	Address1.sendKeys("Navalur,Chennai"); 

	Thread.sleep(1000); 

	WebElement Address2 = driver.findElement(By.name("11address2")); 
	Address2.sendKeys("New Rajendra Nagar"); 

	Thread.sleep(1000); 

	WebElement City = driver.findElement(By.name("13adr_city")); 
	City.sendKeys("Raipur"); 

	Thread.sleep(1000); 
	WebElement State = driver.findElement(By.name("14adrstate")); 
	State.sendKeys("Chhattisgarh"); 

	Thread.sleep(1000); 
	WebElement Country = driver.findElement(By.name("15_country")); 
	Country.sendKeys("India"); 

	Thread.sleep(1000); 

	WebElement Zip = driver.findElement(By.name("16addr_zip")); 
	Zip.sendKeys("492001"); 

	Thread.sleep(1000); 

	WebElement HomePhone = driver.findElement(By.name("20homephon")); 
	HomePhone.sendKeys("7067998047"); 

	 

	Thread.sleep(1000); 

	WebElement WorkPhone = driver.findElement(By.name("21workphon")); 
	WorkPhone.sendKeys("8251080001"); 

	Thread.sleep(1000); 

	WebElement Fax = driver.findElement(By.name("22faxphone")); 

	Fax.sendKeys("105001"); 

	 

	Thread.sleep(1000); 

	WebElement Cellphone = driver.findElement(By.name("23cellphon")); 

	Cellphone.sendKeys("9907129838"); 

	 

	Thread.sleep(1000); 

	WebElement Email = driver.findElement(By.name("24emailadr")); 
	Email.sendKeys("abc@gmail.com"); 
	
	Thread.sleep(1000); 

	WebElement Website = driver.findElement(By.name("25web_site")); 
	Website.sendKeys("www.xyz.com"); 
	
	Thread.sleep(1000); 

	WebElement Userid = driver.findElement(By.name("30_user_id")); 
	Userid.sendKeys("adi123"); 

	Thread.sleep(1000); 

	WebElement Password = driver.findElement(By.name("31password")); 
	Password.sendKeys("qwerty@123"); 

	WebElement ccType = driver.findElement(By.name("40cc__type")); 

	Select cardType = new Select(ccType); 

	Thread.sleep(3000); 

	cardType.selectByValue("9"); 
	System.out.println("selected value is...." + cardType.getFirstSelectedOption().getText()); 

	Thread.sleep(1000); 
	WebElement CCnumber = driver.findElement(By.name("41ccnumber")); 
	CCnumber.sendKeys("5944347578961498"); 
	 
	Thread.sleep(1000); 

	WebElement CVC= driver.findElement(By.name("43cvc")); 
	CVC.sendKeys("964"); 
	WebElement CED = driver.findElement(By.name("42ccexp_mm")); 

	Thread.sleep(3000); 

	Select selCED = new Select(CED); 
	selCED.selectByIndex(5); 

	System.out.println("expiry month is "+selCED.getFirstSelectedOption().getText()); 

	WebElement CED1 = driver.findElement(By.name("43ccexp_yy")); 

	Thread.sleep(3000); 

	Select selCED1 = new Select(CED1); 
	selCED1.selectByIndex(11); 

	System.out.println("Expiry year is "+ selCED1.getFirstSelectedOption().getText()); 

	 

	Thread.sleep(1000); 

	WebElement CC_user= driver.findElement(By.name("44cc_uname")); 
	CC_user.sendKeys("Aditya Thakur"); 

	Thread.sleep(1000); 

	WebElement CC_issuer= driver.findElement(By.name("45ccissuer")); 
	CC_issuer.sendKeys("AMEX"); 

	Thread.sleep(1000); 

	WebElement CC_cust= driver.findElement(By.name("46cccstsvc")); 
	CC_cust.sendKeys("98998998989"); 

	Thread.sleep(1000); 

	WebElement sex= driver.findElement(By.name("60pers_sex")); 
	sex.sendKeys("Male"); 
	
	Thread.sleep(1000); 

	WebElement SS= driver.findElement(By.name("61pers_ssn")); 
	SS.sendKeys("4898938928918"); 
	
	Thread.sleep(1000); 

	WebElement DL= driver.findElement(By.name("62driv_lic")); 
	DL.sendKeys("CG04MN123456789"); 
	WebElement month = driver.findElement(By.name("66mm")); 

	Thread.sleep(3000); 

	Select selMonth = new Select(month); 
	selMonth.selectByValue("5"); 
	System.out.println("selected month is "+ selMonth.getFirstSelectedOption().getText()); 
	WebElement day = driver.findElement(By.name("67dd")); 

	Thread.sleep(3000); 

	Select selDay = new Select(day); 
	selDay.selectByValue("12"); 
	System.out.println("selected date is "+ selDay.getFirstSelectedOption().getText()); 
	WebElement year = driver.findElement(By.name("68yy")); 

	Thread.sleep(3000); 
	
	Select selYear = new Select(year); 
	selYear.selectByValue("2000"); 
	System.out.println("selected year is "+ selYear.getFirstSelectedOption().getText()); 

	Thread.sleep(1000); 
	WebElement Age= driver.findElement(By.name("66pers_age")); 
	Age.sendKeys("23"); 

	Thread.sleep(1000); 
	WebElement Birth= driver.findElement(By.name("67birth_pl")); 
	Birth.sendKeys("Raipur"); 

	Thread.sleep(1000); 

	WebElement Income= driver.findElement(By.name("68__income")); 
	Income.sendKeys("400000"); 

	Thread.sleep(1000); 
	WebElement Msg= driver.findElement(By.name("71__custom")); 
	Msg.sendKeys("Hello "); 

	Thread.sleep(1000); 
	WebElement Comment= driver.findElement(By.name("72__commnt")); 
	Comment.sendKeys("No Comments "); 

	Thread.sleep(10000); 
	driver.findElement(By.xpath("/html/body/div[2]/form/p/input")).click(); 

	} 

}
