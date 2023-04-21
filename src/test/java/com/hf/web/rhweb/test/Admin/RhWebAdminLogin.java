package com.hf.web.rhweb.test.Admin;

import com.controllers.core.WebController;
import com.trigon.dataprovider.DataProviders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
public class RhWebAdminLogin extends WebController {
    private static final Logger logger = LogManager.getLogger();
    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)

    public void rhWebSample_Test(LinkedHashMap<String, Object> tData) {
        author_ScenarioName("Mayank", "Restore Health Sample");

        try {

            logStepAction("Restore Health Login");
            String email = tEnv().getAdminUserName().toLowerCase();
            String password = tEnv().getAdminPassword();
            browser().get(tEnv().getAdminUrl());
            tRhWeb().rhWebCommonActions().rhLogin(email,password);
            hardWait(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


