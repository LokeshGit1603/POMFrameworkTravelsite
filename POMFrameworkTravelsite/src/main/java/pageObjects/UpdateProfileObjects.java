package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement myprofile;
	
	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[5]/div/div/input")
	public static WebElement phone;
	
	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input")
	public static WebElement city;
	
	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input")
	public static WebElement submitprofile;
	
	
	
	

	/*
	 * public static WebElement myprofile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"
	 * )); }
	 * 
	 * public static WebElement phone(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'profilefrm\']/div/div/div[5]/div/div/input")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input")); }
	 * 
	 * public static WebElement submitprofile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input")); }
	 */
}
