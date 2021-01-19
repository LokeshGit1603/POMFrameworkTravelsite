package traveltestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class Updateprofile {

	@Test
	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		
		 
	       PageFactory.initElements(driver, LoginPageObjects.class);
	       
	       LoginPageObjects.username.sendKeys("user@phptravels.com");
	       LoginPageObjects.password.sendKeys("demouser");
	       LoginPageObjects.loginsubmit.click();
	       

		/*
		 * LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.loginsubmit(driver).click();
		 */

		Thread.sleep(2000);
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
		UpdateProfileObjects.myprofile.click();
		UpdateProfileObjects.phone.clear();
		UpdateProfileObjects.phone.sendKeys("0987654322");
		UpdateProfileObjects.city.clear();
		UpdateProfileObjects.city.sendKeys("Trichyy");

		/*
		 * UpdateProfileObjects.myprofile(driver).click();
		 * UpdateProfileObjects.phone(driver).clear();
		 * UpdateProfileObjects.phone(driver).sendKeys("0987654321");
		 * UpdateProfileObjects.city(driver).clear();
		 * UpdateProfileObjects.city(driver).sendKeys("Trichy");
		 */
		/* UpdateProfileObjects.submitprofile(driver).click(); */

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
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement myprofile = driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"
		 * )); myprofile.click();
		 * 
		 * WebElement phonenumber = driver.findElement(By.xpath(
		 * "//*[@id=\'profilefrm\']/div/div/div[5]/div/div/input"));
		 * phonenumber.sendKeys("0987654321");
		 * 
		 * WebElement city = driver.findElement(By.xpath(
		 * "//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input"));
		 * city.sendKeys("Pondy");
		 * 
		 * WebElement submitprofile = driver.findElement(By.xpath(
		 * "//*[@id=\'profilefrm\']/div/div/div[7]/div/button")); submitprofile.click();
		 */

	}

}
