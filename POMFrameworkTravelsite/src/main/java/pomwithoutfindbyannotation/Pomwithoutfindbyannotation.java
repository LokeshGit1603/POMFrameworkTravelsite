package pomwithoutfindbyannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Pomwithoutfindbyannotation {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	

	public static void main(String[] args) {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.manage().window().maximize();
       
       PageFactory.initElements(driver, Pomwithoutfindbyannotation.class);
       
       txtUsername.sendKeys("Admin");
       txtPassword.sendKeys("dummy");
       btnLogin.click();

       driver.quit();
	}

}
