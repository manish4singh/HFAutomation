package com.hf.web.scweb.test;

import com.controllers.core.MobileController;
import com.trigon.dataprovider.DataProviders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class ScWebSampleTest extends MobileController {
    private static final Logger logger = LogManager.getLogger();

    @Test(dataProvider = "getDataFromJson", dataProviderClass = DataProviders.class)
    public void rhWebSample_Test(LinkedHashMap<String, Object> tData) {
        author_ScenarioName("Nethaji", "Google Search Sample");

        try {

            logStepAction("Go to Google");
            browser().get("https://www.google.co.in");

//            String a = db.sendQuery("select email from users where email like 'np%' order by id desc limit 1;", "email");
//            System.out.println("DB Queried output is "+a);
            hardWait(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public static void scrollUp() {
//        JavascriptExecutor jse = (JavascriptExecutor) browser();
//        jse.executeScript("window.scrollBy(0,-1000)");
//    }

//    public static void enrollment(LinkedHashMap<String, Object> tData){
//        String email= tData.get("loginEmail").toString()+ cUtils().generateRandomString(3)+"@yopmail.com";
//        String mobile = tData.get("loginEmail").toString()+cUtils().getRandomNumber(100,999);
//        browser().findElementById("first_name").sendKeys(tData.get("loginEmail").toString()+cUtils().generateRandomString(3));
//        browser().findElementById("last_name").sendKeys(tData.get("loginEmail").toString()+cUtils().generateRandomString(3));
//        browser().findElementById("email").sendKeys(email);
//        browser().findElementById("password").sendKeys(tData.get("loginEmail").toString());
//        browser().findElementById("mobile_phone").sendKeys(mobile);
//
//        JavascriptExecutor jse = (JavascriptExecutor) browser();
//        jse.executeScript("window.scrollBy(0,-1000)");
//
//        Select PhoneType = new Select(browser().findElementById("mobile_phone_platform"));
//        PhoneType.selectByIndex(1);
//        browser().findElementById("initial_weight").sendKeys(tData.get("weight").toString());
//
//        Select Feet = new Select(browser().findElementById("height_feet"));
//        Feet.selectByValue("6");
//
//        Select Inches = new Select(browser().findElementById("height_inches"));
//        Inches.selectByValue("7");
//
//        JavascriptExecutor jse1 = (JavascriptExecutor) browser();
//        jse1.executeScript("window.scrollBy(0,-1000)");
//        Select Gender = new Select(browser().findElementById("gender"));
//        Gender.selectByVisibleText("Male");
//
//        Select Month = new Select(browser().findElementById("_birthday_2i"));
//        Month.selectByVisibleText("February");
//
//        Select Day = new Select(browser().findElementById("_birthday_3i"));
//        Day.selectByIndex(2);
//
//        Select Year = new Select(browser().findElementById("_birthday_1i"));
//        Year.selectByVisibleText("1991");
//
//        browser().findElementByXPath("//div/input[@id='none']").click();
//        browser().findElementByXPath("//div/input[@type='submit']").click();
//        browser().findElementByXPath("//div/p/a[contains(@href,'onboarding')]").isDisplayed();
//    }
}
