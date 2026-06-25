package Handlingfolder;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	
       public static void main(String[] args)
       {
    	   Scanner sc= new Scanner(System.in);
    	   System.out.println(" enter the data");
    	   String searchdata = sc.next();
    	   WebDriver driver= new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	   driver.get("https://www.amazon.in/");
    	  WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    	  element.sendKeys(searchdata);
    	  
    	  // handle autosuggestion
    	 List<WebElement> suggestion = driver.findElements(By.xpath("//div[@id='"+ searchdata + "']"));
    	 
    	 for(int i = 0; i < suggestion.size(); i++)
    	 {
    		System.out.println(suggestion.get(i).getText());
    	 }
    	   driver.close();
       }

}
