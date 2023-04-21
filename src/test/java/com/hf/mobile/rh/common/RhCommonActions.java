package com.hf.mobile.rh.common;

import com.trigon.utils.TrigonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.controllers.core.MobileController.tRhApp;

public class RhCommonActions extends TrigonUtils {
    private static final Logger logger = LogManager.getLogger(RhCommonActions.class);
    public String email = "jsharma@zillion.com";

    /**
     * @author Nethaji
     * @Modifier : Modifier1, Modifier2
     * This method is used to select the app server as Staging by default
     */
    public void selectAppServer() {
        logger.info("Verify that the Email box is present\n");
        if(android()!=null){
            if(tRhApp().restoreHealthSample().popCancelLogin_isPresent()){
                tRhApp().restoreHealthSample().popCancelLogin_click();
            }
        }
        tRhApp().restoreHealthSample().entEmailBox_isDisplayed();
        tRhApp().restoreHealthSample().entEmailBox_enterText(email);
        if(ios()!=null) {
            tRhApp().restoreHealthSample().btnContinue_click();
        }
        logger.info("Click on Change Server\n");
        tRhApp().restoreHealthSample().btnChangeServer_isDisplayed();
        tRhApp().restoreHealthSample().btnChangeServer_click();
        logger.info("Select the app server as Staging\n");
        tRhApp().restoreHealthSample().btnStaging_click();
        hardWait(3000);
        if(android()!=null){
            if(tRhApp().restoreHealthSample().popCancelLogin_isPresent()){
                tRhApp().restoreHealthSample().popCancelLogin_click();
            }
        }
        logger.info("Verify if the Email page is displayed again\n");
        tRhApp().restoreHealthSample().entEmailBox_isDisplayed();
    }

    /**
     * @author Nethaji
     * @Modifier : Modifier1, Modifier2
     * This method is used to Login to the app
     */
    public void rhLogin(String email, String password) {
        logger.info("Enter a valid email to login\n");
        tRhApp().restoreHealthSample().entEmailBox_enterText(email);
        tRhApp().restoreHealthSample().btnContinue_click();
        logger.info("Enter a valid password to login\n");
        tRhApp().restoreHealthSample().entPasswordBox_enterText(password);
        logger.info("Click on Login button\n");
        tRhApp().restoreHealthSample().btnLogin_click();
        hardWait(10000);
        if(tRhApp().restoreHealthSample().popIwillDoLater_isPresent()){
            tRhApp().restoreHealthSample().popIwillDoLater_click();
        }
        logger.info("Verify the app has logged in\n");
        tRhApp().restoreHealthSample().btnMore_isDisplayed();
    }
}