package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesSe {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\venkat\\eclipse-workspace\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[3]/a"));
driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[3]/ul/li[4]/a"));
driver.findElement(By.id("name")).sendKeys("Selenium ");
  driver.switchTo().frame(driver.findElement(By.id("frm3")));
  driver.switchTo().frame(driver.findElement(By.id("frm1")));
	Select option = new Select(driver.findElement(By.id("course")));
	option.selectByVisibleText("Java");
driver.switchTo().parentFrame();
driver.findElement(By.id("name")).clear();
driver.findElement(By.id("name")).sendKeys("frame3");
driver.switchTo().defaultContent();
driver.findElement(By.id("name")).clear();
driver.findElement(By.id("name")).sendKeys("by java");
System.out.println("Exception");
driver.quit();
	}

}
