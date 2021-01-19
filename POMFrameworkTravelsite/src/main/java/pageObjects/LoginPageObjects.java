package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	
	@FindBy(xpath="//*[@id=\'loginfrm\']/div[3]/div[1]/label/input")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\'loginfrm\']/div[3]/div[2]/label/input")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\'loginfrm\']/button")
	public static WebElement loginsubmit;
	

	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/div[3]/div[1]/label/input"
	 * )); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/div[3]/div[2]/label/input"
	 * )); }
	 * 
	 * public static WebElement loginsubmit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\'loginfrm\']/button")); }
	 */

}
