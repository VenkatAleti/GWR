package demo.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropSe {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\venkat\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement Fromdes = driver.findElement(By.id("box1"));
		WebElement Todes = driver.findElement(By.id("box101"));	
		Thread.sleep(3000);
		action.dragAndDrop(Fromdes, Todes).build().perform();
		System.out.println(Todes.getText());
		driver.quit();

	}

}
