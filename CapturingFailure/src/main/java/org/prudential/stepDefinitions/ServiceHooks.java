package org.prudential.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.prudential.base.TestBase;
import org.prudential.enums.Browsers;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
	TestBase testBase;
	
	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectBrowser(Browsers.CHROME.name());
	}
	
	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {
			// Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.embed(screenshot, "image/png");
		    }
		TestBase.driver.quit();
	}
}
