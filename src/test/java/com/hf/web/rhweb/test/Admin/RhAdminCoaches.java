package com.hf.web.rhweb.test.Admin;

import com.controllers.core.WebController;
import com.trigon.dataprovider.DataProviders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class RhAdminCoaches extends WebController {
    private static final Logger logger = LogManager.getLogger();

    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)
    public void rhWebSample_Test(LinkedHashMap<String, Object> tData) throws Exception {
        author_ScenarioName("Nethaji", "Restore Health Admin Login");
        try {

            logStepAction("Login as Admin");
            String email = tEnv().getAdminUserName().toLowerCase();
            String password = tEnv().getAdminPassword();
            browser().get(tEnv().getAdminUrl());
            tRhWeb().rhWebCommonActions().rhLogin(email,password);
            hardWait(2000);
          //  tRhWeb().rHWebSample().linkCoaches_isDisplayed();
          //  tRhWeb().rHWebSample().linkCoaches_click();
            tRhWeb().rHWebAdminCoaches().linkCoaches_isDisplayed();
            tRhWeb().rHWebAdminCoaches().linkCoaches_click();
            hardWait(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

