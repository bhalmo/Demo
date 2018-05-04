package learnAutomation;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotGoogle {
	public static WebDriver driver;
 @BeforeMethod
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		ScreenShotGoogle.captureScreenShot(driver);
 }
	@Test
	public void TestJavaS1() {

		
		driver.manage().window().maximize();
		ScreenShotGoogle.captureScreenShot(driver);

		driver.get("http://www.google.com");
		ScreenShotGoogle.captureScreenShot(driver);
	}

	public static void captureScreenShot(WebDriver driver1) {
		TakesScreenshot ts = ((TakesScreenshot) driver1);
		File src = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("C:\\Users\\mohbhal\\eclipse-workspace\\Demo\\ScreenShots\\google.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		

	}
	@AfterMethod
		public void tearDown() {
		driver.quit();
		}
	}
	

