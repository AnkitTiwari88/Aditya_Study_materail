package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("aditya1205@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("at30687");
		
		System.out.println("Tag name: "+ driver.findElement(By.name("email")).getTagName());
		System.out.println("Attribute name: " + driver.findElement(By.name("pass")).getAttribute("Placeholder"));
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgotten password?")).click(); 
	}

}
