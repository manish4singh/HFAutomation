package com.hf.web.rhweb.test;

import com.controllers.core.WebController;
import com.trigon.dataprovider.DataProviders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
public class RhWebLoginTest extends WebController {
    private static final Logger logger = LogManager.getLogger();
    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)

    public void rhWebSample_Test(LinkedHashMap<String, Object> tData) {
        author_ScenarioName("Mayank", "Restore Health Sample");

        try {

            logStepAction("Restore Health Login");
            browser().get(tEnv().getMemberUrl());
            tRhWeb().rHWebSample().entEmail_enterText(tEnv().getMemberUserName());
            tRhWeb().rHWebSample().btnContinue_click();
            tRhWeb().rHWebSample().entPassword_isDisplayed();
            tRhWeb().rHWebSample().entPassword_enterText(tEnv().getMemberPassword());
            System.out.println("Member Password " + tEnv().getMemberPassword());
//            tRhWeb().rHWebSample().password_enterText(tEnv().getAdminPassword());
            tRhWeb().rHWebSample().btnSign_in_click();
            tRhWeb().rHWebSample().btnGot_It_click();
            hardWait(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
