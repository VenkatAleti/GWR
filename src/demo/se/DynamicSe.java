package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicSe {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carousell.ph/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		
	WebElement olx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='D_bX D_bU D_yE']")));
	System.out.println(driver.findElement(By.xpath("//img[@class='D_bX D_bU D_yE']")));
		olx.click();
		Thread.sleep(5000);
		driver.quit();
	}

	
	
}
