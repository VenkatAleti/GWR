package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsSelenium {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(5000);
				driver.quit();
	}

}
