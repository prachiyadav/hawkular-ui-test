package org.qe.hawkular.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qe.hawkular.element.*;
import org.qe.hawkular.util.HawkularUtils;

public class HawkularGraphicTestPage {
    public final WebDriver driver;

    public HawkularGraphicTestPage(WebDriver driver) {

        this.driver = driver;
    }

    By userImageTest = HawkularGraphicTestConstants.userImageTest;
    
    public boolean verifyUserNameImagePresent() {
        HawkularUtils util = new HawkularUtils(driver);
        return util.waitForElementPresent(userImageTest);
    }

}