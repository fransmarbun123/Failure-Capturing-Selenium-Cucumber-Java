package org.prudential.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	private WebDriver driver;
	
	public LogInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By menu_login = By.xpath("//a[@class='login']");
	By input_username = By.xpath("//input[@id='email']");
	By input_password = By.xpath("//input[@id='passwd']");
	By button_login = By.xpath("//button[@id='SubmitLogin']");
	
	public void clickMenuLogin() {
		driver.findElement(menu_login).click();
	}
	
	public void inputUsername(String username) {
		driver.findElement(input_username).sendKeys(username);
	}
	
	public void inputPassword(String password) {
		driver.findElement(input_password).sendKeys(password);
	}
	
	public void clikButtonLogin() {
		driver.findElement(button_login).click();
	}
	
	By image = By.xpath("//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img");
	
	public boolean imageDisplayed() {
		return driver.findElement(image).isDisplayed();
	}
}
