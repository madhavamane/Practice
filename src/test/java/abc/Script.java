package abc;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script {

	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);	
	driver.get("https://www.youtube.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement Input = driver.findElement(By.xpath("//input[@id='search']"));
	Input.sendKeys("marathi songs");
	Input.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='History']")).click();
	
	System.out.println("Passed*********");	
	driver.close();	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
