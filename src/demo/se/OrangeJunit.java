package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeJunit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		WebDriverWait wait = new WebDriverWait(driver,10); 
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li[1]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li[1]/div/div[1]/div[1]/div/div[1]/p[3]/a")))
        .click()
		.perform();
	}

}
