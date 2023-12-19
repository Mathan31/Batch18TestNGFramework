package pages;

import org.openqa.selenium.By;

import base.BrowserFactory;

public class HomePage extends BrowserFactory{
	
	private By applauncherIcon=By.xpath("//div[@class='slds-icon-waffle']");
	private By userImg=By.xpath("//span[@class='uiImage']/parent::div[@data-aura-class='forceEntityIcon']");
	private By logoutLink = By.xpath("//a[text()='Log Out']");
	
	
	public HomePage verifyHomeElement() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(applauncherIcon).isDisplayed());
		System.out.println(driver.findElement(userImg).isDisplayed());
		if(driver.findElement(applauncherIcon).isDisplayed() && 
				driver.findElement(userImg).isDisplayed())
		{
				System.out.println("User landed to the home page");
			return this;
		}else {
			System.out.println("User not landed to the home page");
			return this;
		}
	}
	
	public HomePage clickUserImg() {
		driver.findElement(userImg).click();
		return this;
	}
	
	public LoginPage clickLogout() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(logoutLink).click();
		return new LoginPage();
	}
	
	

}
