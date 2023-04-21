package com.hf.mobile.sc.tests;

import com.controllers.core.MobileController;
import com.trigon.dataprovider.DataProviders;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class SC_Sample extends MobileController {


    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)

    public void rhMobileSample_Test(LinkedHashMap<String, Object> tData) throws Exception {

        author_ScenarioName("Nethaji", "RH Sample Test Scenario");

        try {
            String email = tData.get("loginEmail").toString();
            String password = tData.get("loginPassword").toString();
            logStepAction("Select App server");
            tRhApp().rhCommonActions().selectAppServer();
            logStepAction("Login to the App");
            tRhApp().rhCommonActions().rhLogin(email,password);
            hardWait(5000);
            tRhApp().restoreHealthSample().btnMore_click();
            logStepAction("Click on Settings");
            hardWait(3000);
            tModels().verticalSwipeByPercentages(.7,.3,.6);
            tRhApp().restoreHealthSample().btnSettings_click();
            logStepAction("Verify the logged in email");
            tRhApp().restoreHealthSample().txtEmailSettings_verifyText("nptestiosrh@yopmail.com","Exact");
            logStepAction("Logout from the App");
            tRhApp().restoreHealthSample().btnLogOut_click();

            tRhApp().restoreHealthSample().entEmailBox_click();
            tRhApp().restoreHealthSample().entEmailBox_isDisplayed();

            hardWait(3000);
            tModels().hideMobileKeyBorad();
            logStepAction("Verify Logout from the App");
//            if (android()!=null){
//                tRh().restoreHealthSample().popCancelLogin_click();
//            }
//            tRh().restoreHealthSample().entEmailBox_isDisplayed();
            if(ios()!=null) {
                tRhApp().restoreHealthSample().entEmailBox_isDisplayed();
            } else if (android()!=null){
                tRhApp().restoreHealthSample().popCancelLogin_click();
                tRhApp().restoreHealthSample().entEmailBox_isDisplayed();
            }
        } catch (Exception e) {
            hardFail(e);
        } finally {
            testTearDown();
        }
    }
}