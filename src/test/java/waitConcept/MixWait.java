package waitConcept;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MixWait {
@Test
public void checkWait() {
		
		// Opening chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohbhal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		// setting implicit time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		// Loading a URL
		driver.get("https://www.redbus.in/");
		
		// defining explicit wait
		WebDriverWait wait= new WebDriverWait(driver, 20);
		// Locating and typing in From text box. 
		
		System.out.println("Wait starts:"+new Date());
		WebElement fromTextBox= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("src"))));
		System.out.println("Wait ends:"+new Date());
		driver.quit();
		
	}

}
