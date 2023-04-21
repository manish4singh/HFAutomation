package com.hf.web.rhweb.common;

import com.controllers.core.WebController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.controllers.core.MobileController.tRhApp;

public class RhWebCommonActions extends WebController {

    private static final Logger logger = LogManager.getLogger(RhWebCommonActions.class);

    /**
     * @author Nethaji
     * @Modifier : Nethaji
     * This is the skeleton of a test method
     */
    public void method(String url, String... emailId) {
        logger.info("Your steps\n");
    }
    public void rhLogin(String email1, String password1) {
        logger.info("Enter a valid email to login\n");
        tRhWeb().rHWebSample().entEmail_enterText(email1);
        tRhWeb().rHWebSample().btnContinue_click();
        logger.info("Enter a valid password to login\n");
        tRhWeb().rHWebSample().entPassword_enterText(password1);
        logger.info("Click on Login button\n");
        tRhWeb().rHWebSample().btnSign_in_click();
        if(tRhWeb().rHWebSample().btnGot_It_isPresent()){
            tRhWeb().rHWebSample().btnGot_It_click();
        }
        else{
        }
    }
}