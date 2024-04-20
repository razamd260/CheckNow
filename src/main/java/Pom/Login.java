package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
   
	 @FindBy(id="email")
	 private WebElement email;
	 
	 @FindBy(id="pass")
	 private WebElement pass;
	 
	 @FindBy(name="login")
	 private WebElement login;
	 
	 public Login(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void user(String user) {
		 email.sendKeys(user);;
	 }
	 
	 public void pass(String pass) {
		 this.pass.sendKeys(pass);;
	 }
	 
	 public void login() {
		 login.click();
	 }
	 
}
