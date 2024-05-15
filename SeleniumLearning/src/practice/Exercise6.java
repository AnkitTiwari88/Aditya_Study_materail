package practice;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/text-box"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 

		System.out.println("Title of WebPage" +driver.getTitle()); 

		WebElement Fullname = driver.findElement(By.id("userName")); 
		Fullname.sendKeys("Aditya Thakur"); 

		WebElement email = driver.findElement(By.id("userEmail")); 
		email.sendKeys("aditya1205@gmail.com"); 
		
		WebElement address = driver.findElement(By.id("currentAddress")); 
		address.sendKeys("Stanza Living Navalur , Chennai"); 

		WebElement permanentaddress = driver.findElement(By.id("permanentAddress")); 
		permanentaddress.sendKeys("E-02/52/7 ,New Rajendra Nagar , Raipur"); 
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
			

	}

}
