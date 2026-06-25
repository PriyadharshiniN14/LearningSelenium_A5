package Handlingfolder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_autosuggestion {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Downloads/EmbededWebpage.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement single = driver.findElement(By.cssSelector("//select[name='country1']"));
	Select obj= new Select(single);
	
	boolean status = obj.isMultiple();
if (status) {
	System.out.println(" single select drop down");
	
}
else
{
	System.out.println(" multiple select drop down");
	
}
 WebElement multiple = driver.findElement(By.cssSelector("select[name='country2']"));
 Select obj1= new Select(multiple);
 
 boolean status1 = obj1.isMultiple();
 if(status1)
 {
	 System.out.println("multiple select drop down");
 }
 else
 {
	 System.out.println("single select drop down");
	 
	 
}
 obj1.selectByIndex(3);
 obj1.selectByValue("usa");
 obj1.selectByVisibleText("AUSTRALIA");
 
 obj1.deselectByIndex(3);
 obj1.deselectByValue("usa");
 obj1.deselectByVisibleText(" AUSTRALIA ");
 

	}
}
