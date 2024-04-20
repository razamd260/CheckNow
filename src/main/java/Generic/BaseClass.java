package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
@SuppressWarnings("unused")
public class BaseClass {
	protected WebDriverUtility web;
	protected PropertiesUtility pro;
	public WebDriver driver;
	protected Login log;
    @BeforeClass
	public void launch() {
    	pro=new PropertiesUtility();
        pro.propertiesInt(IConstantPath.PROPERTIES_PATH);
    	String browser=pro.getproperty("browser");
     	String url=pro.getproperty("url");
    	String St=pro.getproperty("time");
    	long time=Integer.parseInt(St);
    	web=new WebDriverUtility();
    	WebDriver rdriver=web.launch(browser, driver, time);
    	driver=rdriver;
    	driver.get(url);
    	
    	
    	
		
	}
    @BeforeMethod
   	public void login() {
    	log=new Login(driver);
    	pro.propertiesInt(IConstantPath.PROPERTIES_PATH);
    	String user=pro.getproperty("user");
    	String pass=pro.getproperty("pass");
    	log.user(user);
    	log.pass(pass);
    	log.login();
    	
    	
   	}
    
    @Test
   	public void test() {
      
   	}
    
    @AfterMethod
   	public void logout() {
      
   	}
    @AfterClass
   	public void closeBrowser() {
      driver.close();
   	}
    
}
