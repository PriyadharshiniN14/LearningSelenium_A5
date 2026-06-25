package Handlingfolder;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingJScode {
	public static void main(String[] args)
	{
	
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor jseobj= (JavascriptExecutor) (driver);
		
		jseobj.executeScript("window.location= arguments[0]", "https://automationexercise.com/");
		jseobj.executeScript("history.go(0)");
		
	 
	  System.out.println(jseobj.executeScript("return document.title"));
	  System.out.println( jseobj.executeScript("return document.URL"));
	  jseobj.executeScript("arguments[0].click()", driver.findElement(By.linkText("Login")));
	  jseobj.executeScript("arguments[0].value='priya'", driver.findElement(By.xpath("//input[@data-qa='signup-name']")));
	  jseobj.executeScript("arguments[0].value='priya555@gmail.com'",driver.findElement(By.name("//input[@data-qa='signup-email']")));
	  jseobj.executeScript("arguments[0].click", driver.findElement(By.xpath("//button[text()='Signup']")));
	  jseobj.executeScript("arguments[0].value='priyadharshini@gmail.com'",driver.findElement(By.name("//input[@data-qa='signup-email']")));
	  
	  System.out.println("handling jscode");	
	}

}
