package com.hf.web.rhweb.test.Admin;

import com.controllers.core.WebController;
import com.trigon.dataprovider.DataProviders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class RhAdminCensusManagement extends WebController {
    private static final Logger logger = LogManager.getLogger();

    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)
    public void rhWebSample_Test(LinkedHashMap<String, Object> tData) throws Exception {
        author_ScenarioName("Nethaji", "Restore Health Admin Login");
        try {

            logStepAction("Login as Admin");
            String email1 = tEnv().getAdminUserName().toLowerCase();
            String password1 = tEnv().getAdminPassword();
            browser().get(tEnv().getAdminUrl());
            tRhWeb().rhWebCommonActions().rhLogin(email1,password1);
            hardWait(5000);
           // tRhWeb().rHWebSample().linkCensus_isDisplayed();
           // tRhWeb().rHWebSample().linkCensus_click();
            tRhWeb().rHWebAdminCensusManagement().linkCensus_isDisplayed();
            tRhWeb().rHWebAdminCensusManagement().linkCensus_click();
            hardWait(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}