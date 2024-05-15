package practice;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver; 

public class Exercise5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe"); 

		WebDriver driver = new EdgeDriver(); 

		driver.manage().window().maximize(); 

		driver.get("https://demoqa.com/automation-practice-form");		 

		WebElement FirstName = driver.findElement(By.id("firstName")); 

		FirstName.sendKeys("Aditya"); 

		Thread.sleep(1000); 

		WebElement LastName = driver.findElement(By.id("lastName")); 
		LastName.sendKeys("Thakur"); 

		Thread.sleep(1000); 

		WebElement Email = driver.findElement(By.id("userEmail")); 
		Email.sendKeys("aditya1205@gmail.com"); 

		Thread.sleep(1000); 

		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click(); 

		Thread.sleep(1000); 

		WebElement Number = driver.findElement(By.id("userNumber")); 
		Number.sendKeys("7067998047"); 

	    WebElement subject = driver.findElement(By.id("subjectsInput")); 
		subject.sendKeys("Maths"); 

	    WebElement hobbiesCheckbox = driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-2\"]")); 

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("arguments[0].click();", hobbiesCheckbox); 

		WebElement address = driver.findElement(By.id("currentAddress")); 
	    address.sendKeys("Chennai , Stanza Living , India ");     

	}

}
