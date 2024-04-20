package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
@SuppressWarnings("unused")
public class WebDriverUtility {
  
	public WebDriver launch(String browser,WebDriver driver,long time) {
		
		switch(browser) {
			case "chrome" :
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			    break;
			case "firefox" :
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			    break;
			case "edge" :
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			    break;
			default : System.out.println("Sorry no info"); 
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		return driver;
	}
	
}
