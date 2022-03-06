package demo.se;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

 public class JunitDemo {
	 WebDriver driver;
	  
		String url ="https://lex.infosysapps.com/en/login";
		
		
		@Before
		
	public void Before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 System.out.println("good");
		 
		 
  driver.findElement(By.xpath("//*[@id=\"ws-root-main\"]/div/ws-login-root/ws-login/div/div[4]/div/div[1]/div[1]/div[2]/div/button[1]")).click();
  driver.findElement(By.id("i0116"));
  
  //Actions action =new Actions(driver);
	//action.moveToElement(Infy).click();
	//action.moveToElement(Mail).click().build().perform();
		
	}

	@Test
	public void test() {

		System.out.println("Test");
	}

}


 
