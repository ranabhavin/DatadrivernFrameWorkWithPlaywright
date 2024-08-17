package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

import base.BaseTest;

public class BankManagerLoginTest extends BaseTest {

	@Test
	public void loginAsBankManager() {

		Browser browse = getBrowser("chrome");
		navigate(browse, "https://www.way2automation.com/angularjs-protractor/banking/#/login");
		click("bmBtn_CSS");
		Assert.assertTrue(isElementPresent("cmBtn_CSS"), "Bank Manager not logged in");
	}

}
