package traveltestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class Login {

	@Test
	public static void main(String[] args) {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login");
       driver.manage().window().maximize();
       
       PageFactory.initElements(driver, LoginPageObjects.class);
       
       LoginPageObjects.username.sendKeys("user@phptravels.com");
       LoginPageObjects.password.sendKeys("demouser");
       LoginPageObjects.loginsubmit.click();
       
		/*
		 * LoginPageObjects.username(driver).sendKeys("user@phptravels.com");;
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.loginsubmit(driver).click();
		 */
       
		/*
		 * WebElement username =
		 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/div[3]/div[1]/label/input"
		 * )); username.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/div[3]/div[2]/label/input"
		 * )); password.sendKeys("demouser");
		 * 
		 * WebElement loginbtn =
		 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/button"));
		 * loginbtn.click();
		 */
       
       

	}

}
