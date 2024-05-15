package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DobFromDropDown {		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\DobFromDropDown\\Browser\\msedgedriver.exe");
		    WebDriver driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    //Open the URL
		    driver.get("https://www.fb.com");
		    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		    Thread.sleep(2000);
		    //Enter the first name
		    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("ABC");
		    Thread.sleep(2000);
		    //Enter the surname 
		    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Z");
		    Thread.sleep(2000);
		    //Enter the mobile number
		    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("987654321");
		    Thread.sleep(2000);
		    //Select day from dropdown using selectByVisibleText method
		    WebElement DOBD=driver.findElement(By.cssSelector("select[name='birthday_day']"));
		    Select dobDay=new Select(DOBD);
		    dobDay.selectByVisibleText("1");
		    Thread.sleep(3000);
		    //Select month from dropdown using selectByIndex method
		    WebElement DOBM=driver.findElement(By.cssSelector("select[name='birthday_month']"));
		    Select dobMonth=new Select(DOBM);
		    dobMonth.selectByIndex(8);
		    Thread.sleep(3000);
		    ////Select month from dropdown using selectByValue method
		    WebElement DOBY=driver.findElement(By.cssSelector("select[name='birthday_year']"));
		    Select dobYear=new Select(DOBY);
		    dobYear.selectByValue("2000");
		    Thread.sleep(3000);
		    //Select gender
		    WebElement radioButton=driver.findElement(By.cssSelector("input[value='2']"));
		    radioButton.click();
		    Thread.sleep(3000);
		    //Click on Signup
		    WebElement signUp =driver.findElement(By.cssSelector("button[name='websubmit']"));
		    signUp.click();
		    Thread.sleep(3000);
		    //Verify the error messages
		    WebElement actual_error = driver.findElement(By.xpath("//div[contains(text(),'Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).')]"));
		    String a=actual_error.getText();
		    String expected_error="Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).";
		    if(a.equals(expected_error)) {
		    	System.out.println("Password error message is: "+ a);
		    } else {
		    	System.out.println("Failed");
		    }
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("input[name='reg_email__']")).click();
		    WebElement actual_text=driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid mobile number or email address.')]"));
		    String b =actual_text.getText();
		    String expected_Text= "Please enter a valid mobile number or email address.";
		    if(b.equals(expected_Text)) {
		    	System.out.println("Mobile/Email error message is: "+ b);
		    } else {
		    	System.out.println("Failed");
		    }
		    Thread.sleep(3000);
		    //Close the browser
		    driver.quit();
	}

}
