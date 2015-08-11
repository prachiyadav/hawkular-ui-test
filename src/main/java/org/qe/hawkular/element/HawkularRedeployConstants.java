package org.qe.hawkular.element;
import org.openqa.selenium.By;
public class HawkularRedeployConstants {

	public static final By applicationServers  =  By.xpath("//a[text()='Application Servers']");
	public static final By selectApplicationServer = By.xpath("//a[@href='/hawkular-ui/app/app-details/dhcp201-191~Local/jvm']");
	public static final By selectDeployments =  By.xpath("//a[@class='hk-deployments']"); 
	public static final By selectFirstWarAction =  By.xpath("//descendant :: button[@id='dropdownMenu2'][1]");
	public static final By selectSecondWarAction =  By.xpath("//descendant :: button[@id='dropdownMenu2'][2]");
	public static final By selectRedeployWar =  By.linkText("Redeploy");
	public static final By selectDisableWar =  By.linkText("Disable");
	public static final By selectEnableWar =  By.linkText("Enable");
	public static final By verifySuccess = By.cssSelector("div.toast-message");
	public static final By verifySucceeded = By.xpath("//*[contains(text(), 'succeeded')]");

	

}