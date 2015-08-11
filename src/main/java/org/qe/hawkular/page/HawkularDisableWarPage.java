package org.qe.hawkular.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qe.hawkular.element.*;
import org.qe.hawkular.util.HawkularUtils;


public class HawkularDisableWarPage {
	
	public final WebDriver driver;

    public HawkularDisableWarPage(WebDriver driver) {

        this.driver = driver;
    }    
  
    By selectDisableWar = HawkularRedeployConstants.selectDisableWar;
  
    
    


public void clickToDisableFirstWar(){
	
	HawkularUtils utils = new HawkularUtils(driver);
	utils.navigateTo(selectDisableWar);
	
}


}