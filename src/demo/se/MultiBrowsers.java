package demo.se;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowsers {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\venkat\\eclipse-workspace\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("ParentWindowHandle - " + parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowhandles = driver.getWindowHandles();
	for(String WindowHandle : windowhandles) {
		if(!WindowHandle.equals(parentWindowHandle)) {
			driver.switchTo().window(WindowHandle);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("firstName")).sendKeys("Aleti Sai");
			Thread.sleep(5000);
			driver.findElement(By.id("lastName")).sendKeys("Venkat");
			driver.close();
		}
		
	//System.out.println(WindowHandle + driver.getTitle());
	}
	driver.switchTo().window(parentWindowHandle);
	driver.findElement(By.id("name")).sendKeys("Done!");
	}

}
