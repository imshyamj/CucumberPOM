package com.crm.qa.stepDefinitions;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeStepDefinitons extends TestBase {

	LoginPage lp;
	HomePage hp;
	TestUtil tu;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		initialization();
		lp = new LoginPage();
		tu = new TestUtil();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title,"Free CRM - CRM software for customer relationship management, sales, and support.");
		
	}

	@Then("^user logs on$")
	public void user_logs_on() throws Throwable {
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		String homePagetitle = hp.validateHomePageTitle();
		Assert.assertEquals(homePagetitle, "CRMPRO");
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		tu.switchToFrame();
		boolean flag = hp.verifyCorrectUserLabel();
		Assert.assertTrue(flag);
	}
	
	@Then("^user quit the brwoser$")
	public void user_quit_the_brwoser() throws Throwable {
	    driver.quit();
	}


}
