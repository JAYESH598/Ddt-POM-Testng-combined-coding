package OrHR.OrHR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBrowser  extends ObjectRepo{
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().deleteAllCookies();
		
	}
	
	/*public static void Readproperties() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\src\\main\\java\\OrHR\\OrHR\\ObjectRepo.java");
	    prop.load(fis);
	}*/
	
	public static void closeBrowser() {
		
		driver.close();
	}

}
