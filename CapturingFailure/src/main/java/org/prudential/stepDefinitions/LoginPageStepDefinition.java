package org.prudential.stepDefinitions;

import org.prudential.base.TestBase;
import org.prudential.pageObjects.LogInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition extends TestBase {
	
	LogInPage lp = new LogInPage(driver);
	
	@Given("I am on the Login page URL {string}")
	public void i_am_on_the_Login_page_URL(String arg1) {
	    driver.get(arg1);
	}

	@Then("I should see Log In Page")
	public void i_should_see_Log_In_Page() {
	    System.out.print("");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String arg1) {
		lp.clickMenuLogin();
	    lp.inputUsername(arg1);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String arg1) {
	    lp.inputPassword(arg1);
	}

	@When("click on login button")
	public void click_on_login_button() {
	    lp.clikButtonLogin();
	    lp.imageDisplayed();
	}
}
