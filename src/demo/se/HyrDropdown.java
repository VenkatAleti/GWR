package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HyrDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		WebDriverWait wait = new WebDriverWait(driver,10); 
		driver.manage().window().maximize();
       WebElement drpdwn = driver.findElement(By.id("BlogArchive1_ArchiveMenu"));
       Select drp = new Select(drpdwn);
       //drp.selectByIndex(2);
       drp.selectByValue("October(8)");
        
	}

}
