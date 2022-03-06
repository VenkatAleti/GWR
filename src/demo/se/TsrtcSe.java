package demo.se;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TsrtcSe {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\venkat\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		WebElement From = driver.findElement(By.id("fromPlaceName"));
		From.sendKeys("Manu");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(WebElement Mngr : suggestions) {
			System.out.println(Mngr.getText());
			if(Mngr.getText().trim().equals("MANUGUR")) {
				Thread.sleep(1000);
				Mngr.click();
				driver.quit();
				
			}
		}
		
		

	}

}
