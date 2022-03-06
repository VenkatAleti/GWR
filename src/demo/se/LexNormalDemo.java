package demo.se;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LexNormalDemo {
	


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lex.infosysapps.com/en/login");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ws-root-main\"]/div/ws-login-root/ws-login/div/div[4]/div/div[1]/div[1]/div[2]/div/button[1]")).click();
		
Thread.sleep(5000);
    driver.findElement(By.id("i0116")).sendKeys("aleti.venkat@infosys.com");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("passwordInput")).sendKeys("taknevKja1@.in");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
    Thread.sleep(5000);
    //Actions action = new Actions(driver);
    //Thread.sleep(5000);
    /* driver.findElement(By.xpath("//*[@id=\"feature_notification\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"41a9a27e-357f-4640-93a5-4c63978b9454\"]/span/div[2]/span")).click();
     Thread.sleep(5000);
   //WebElement Profile = driver.findElement(By.className("mat-icon notranslate material-icons mat-icon-no-color"));
   //WebElement Logout =driver.findElement(By.xpath("//*[@id=\"ws-root-main\"]/div/ws-app-profile/mat-toolbar/div/div[2]/button"));
   //Thread.sleep(5000);
  
    driver.quit();
	}
	*/

}
}
