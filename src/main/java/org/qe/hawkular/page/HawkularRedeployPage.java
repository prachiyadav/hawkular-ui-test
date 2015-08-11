package org.qe.hawkular.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qe.hawkular.element.*;
import org.qe.hawkular.util.HawkularUtils;


public class HawkularRedeployPage {
	
	public final WebDriver driver;

    public HawkularRedeployPage(WebDriver driver) {

        this.driver = driver;
    }    
    By applicationServers = HawkularRedeployConstants.applicationServers;
    By selectApplicationServer = HawkularRedeployConstants.selectApplicationServer;
    By selectDeployments = HawkularRedeployConstants.selectDeployments;
    By selectFirstWarAction = HawkularRedeployConstants.selectFirstWarAction;
    By selectSecondWarAction = HawkularRedeployConstants.selectSecondWarAction;
    By selectRedeployWar = HawkularRedeployConstants.selectRedeployWar;
    By verifySuccess = HawkularRedeployConstants.verifySuccess;
    By verifySucceeded = HawkularRedeployConstants.verifySucceeded;
    
    
    public void navigateApplicationServers() {
        HawkularUtils utils = new HawkularUtils(driver);
     
        utils.navigateTo(applicationServers);
        utils.waitForElementPresent(selectApplicationServer);
    }
    
    public void navigateToApplicationServer() {
        HawkularUtils utils = new HawkularUtils(driver);
     
        utils.navigateTo(selectApplicationServer);
        utils.waitForElementPresent(selectDeployments);
    }
    
    public void navigateToDeployments(){
    	
    	HawkularUtils utils = new HawkularUtils(driver);
    	utils.navigateTo(selectDeployments);
    	 utils.waitForElementPresent(selectFirstWarAction);
    }
    
public void clickFirstWarAction(){
    	
    	HawkularUtils utils = new HawkularUtils(driver);
    	utils.navigateTo(selectFirstWarAction);
    	utils.waitForElementPresent(selectRedeployWar);
    }

public void clickToRedeployFirstWar(){
	
	HawkularUtils utils = new HawkularUtils(driver);
	utils.navigateTo(selectRedeployWar);
	
}

public void verfiyRedeploySuccess(){
	HawkularUtils utils = new HawkularUtils(driver);
	utils.waitForElementPresent(verifySuccess);
	utils.waitForElementPresent(verifySucceeded);

}

}