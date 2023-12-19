package testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BrowserFactory;
import pages.LoginPage;

public class TC001_Login extends BrowserFactory{
	
	//@Test(priority = 1)
	public void loginFieldValidation() {
		boolean result = new LoginPage()
		.verifyLoginElement();
		Assert.assertTrue(result);
	}
	
	@Test(priority = 2)
	public void loginWithValidCredential() {
		boolean result = new LoginPage()
		.enterUserName("mathan@credosystemz.sanbox")
		.enterPassword("MyLearning$1")
		.clickLogin()
		.verifyHomeElement()
		.clickUserImg()
		.clickLogout()
		.verifyLoginElement();
		Assert.assertTrue(result);
	}
	
	@Test(priority = 3)
	public void loginWithInValidCredential() {
		boolean result = new LoginPage()
		.enterUserName("sathya@systemz.com")
		.enterPassword("testing123")
		.clickLoginWithinvalidCredential()
		.validateErrorMsg();
		Assert.assertTrue(result);
	}
	
	

}
