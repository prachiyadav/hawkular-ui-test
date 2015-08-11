package org.qe.hawkular.tests;

import org.openqa.selenium.WebDriver;
import org.qe.hawkular.driver.HawkularSeleniumLocalWebDriver;
import org.qe.hawkular.driver.HawkularSeleniumWebDriver;
import org.qe.hawkular.element.*;
import org.qe.hawkular.page.*;
import org.testng.annotations.Test;

public class HawkularDisableWarTest extends HawkularSeleniumLocalWebDriver{
	
	@Test
	public void hawkularLogin()
			throws Exception {
		WebDriver driver = createLocalDriver();

		driver.get(HawkularSeleniumWebDriver.hawkularUrl);
		System.out.println(driver.getTitle());

		HawkularLoginPage loginPage = new HawkularLoginPage(driver);

		loginPage.verifyLoginTitle();

		loginPage = new HawkularLoginPage(driver);
		loginPage.loginAs(HawkularRegistrationPageConstants.username2,
				HawkularRegistrationPageConstants.password2);

			
		HawkularGraphicTestPage verifyUser= new HawkularGraphicTestPage(driver);
		verifyUser.verifyUserNameImagePresent();
		
		HawkularRedeployPage testRedeploy = new HawkularRedeployPage(driver);
		testRedeploy.navigateApplicationServers();
		testRedeploy.navigateToApplicationServer();
		testRedeploy.navigateToDeployments();
		testRedeploy.clickFirstWarAction();
		
		HawkularDisableWarPage testDisable = new HawkularDisableWarPage(driver);
		testDisable.clickToDisableFirstWar();
		testRedeploy.verfiyRedeploySuccess();
				
		driver.quit();
	}
	
}