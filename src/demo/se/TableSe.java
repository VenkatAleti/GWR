package demo.se;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement omayo = driver.findElement(By.xpath("//div[@id='HTML30']"));
		List<WebElement> rows = omayo.findElements(By.tagName("tr"));
		//System.out.println("Rows size" + rows.size());
		for(WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols) {
				System.out.println("Column value- " + col.getText());
				
			}
		}
driver.quit();
	}

}
