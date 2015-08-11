package org.qe.hawkular.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qe.hawkular.element.*;
import org.qe.hawkular.util.HawkularUtils;

public class HwkularEnableWarPage {
		
		public final WebDriver driver;

		public HwkularEnableWarPage(WebDriver driver) {

	        this.driver = driver;
	    }    
	  
	    By selectEnableWar = HawkularRedeployConstants.selectEnableWar;
	  
	    
	    


	public void clickToEnableWar(){
		
		HawkularUtils utils = new HawkularUtils(driver);
		utils.navigateTo(selectEnableWar);
		
	}


}
