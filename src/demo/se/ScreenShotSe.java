package demo.se;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSe {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\eclipse-workspace\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://omayo.blogspot.com/");
		ScreenshotSe("omayo_1");
	}
		public static void ScreenshotSe(String Se) throws IOException {
	TakesScreenshot convertingdriverToscreenshot = (TakesScreenshot)driver;
	File outtype = (File) convertingdriverToscreenshot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(outtype,new File("./ScreenShots/"+Se+".png") );
	} catch (IOException e) {
		
		 e.printStackTrace();
	}
	driver.quit();
}
}

