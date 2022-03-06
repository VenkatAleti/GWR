package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxSe {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement FaceOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
	FaceOption.click();
	Thread.sleep(3000);
	driver.quit();
	}

}
