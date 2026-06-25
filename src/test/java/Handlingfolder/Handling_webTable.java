package Handlingfolder;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_webTable {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://vinothqaacademy.com/webtable/");
		WebElement vinoth_details = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]//td[2]"));
		System.out.println(vinoth_details.getText());
		
		List<WebElement> allemp = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
		for(int i= 0; i<allemp.size(); i++)
		{
			System.out.println(allemp.get(i).getText());
		
	}
		
	List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
    for(int i=0;i<alldata.size();i++) {
    	System.out.println(alldata.get(i).getText());
    }
}
}
