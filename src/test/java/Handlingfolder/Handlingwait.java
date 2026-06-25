package Handlingfolder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwait {
	
	public static void main(String[] args)
	{
	   WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
	    WebElement element = driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
	    System.out.println(element.getText());
	    
	    WebElement login = driver.findElement(By.cssSelector("#loginBtn"));
		login.click();
		
	    driver.close();
	}
	

}
