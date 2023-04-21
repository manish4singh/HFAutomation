package com.controllers.core;

import autogenerated.objrepo.APIObjects;
import com.controllers.models.APIModels;
import com.controllers.models.TestModels;
import com.trigon.testbase.TestController;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;

public class APIController extends TestController {
    public static APIModels api() {
        return new APIModels();
    }

    public static APIObjects tApi() {
        return new APIObjects();
    }

    public static TestModels tModels() {
        return new TestModels();
    }


    @BeforeTest(alwaysRun = true)
    @Parameters({"testEnvPath", "excelFilePath", "jsonFilePath", "jsonDirectory", "applicationType", "url", "browser", "browser_version", "device", "os_version", "URI", "version", "adminUserName", "adminPassword", "isJWT", "endpointPrefix", "memberUserName", "memberPassword", "adminUrl", "editorPassword", "memberUrl", "coachUrl",
            "coachUserName", "coachPassword", "editorUrl", "editorUserName", "test_region", "browserstack_execution_local","bs_app_path","productName"})
    public void moduleInit(ITestContext context, XmlTest xmlTest, @Optional String testEnvPath, @Optional String excelFilePath,
                           @Optional String jsonFilePath, @Optional String jsonDirectory, @Optional String applicationType, @Optional String url, @Optional String browser,
                           @Optional String browserVersion, @Optional String device, @Optional String os_version,
                           @Optional String URI, @Optional String version, @Optional String adminUserName, @Optional String adminPassword, @Optional String isJWT, @Optional String endpointPrefix,
                           @Optional String memberUserName, @Optional String memberPassword, @Optional String adminUrl, @Optional String editorPassword,
                           @Optional String memberUrl, @Optional String coachUrl, @Optional String coachUserName,
                           @Optional String coachPassword, @Optional String editorUrl, @Optional String editorUserName, @Optional String test_region, @Optional String browserstack_execution_local,@Optional String bs_app_path,@Optional String productName) {
        moduleInitilalization(context, xmlTest, testEnvPath, excelFilePath, jsonFilePath, jsonDirectory, applicationType, url, browser, browserVersion, device, os_version, URI, version, adminUserName, adminPassword, isJWT, endpointPrefix, memberUserName, memberPassword, adminUrl, editorPassword, memberUrl, coachUrl, coachUserName, coachPassword, editorUrl, editorUserName, test_region, browserstack_execution_local,bs_app_path,productName);
    }

    @BeforeClass(alwaysRun = true)
    @Parameters({"testEnvPath", "excelFilePath", "jsonFilePath", "jsonDirectory", "applicationType", "url", "browser", "browser_version", "device", "os_version", "URI", "version", "adminUserName", "adminPassword", "isJWT", "endpointPrefix","memberUserName", "memberPassword", "adminUrl", "editorPassword", "memberUrl", "coachUrl", "coachUserName", "coachPassword", "editorUrl", "editorUserName", "test_region", "browserstack_execution_local","bs_app_path","productName"})
    public void classInit(ITestContext context, XmlTest xmlTest, @Optional String testEnvPath, @Optional String excelFilePath,
                          @Optional String jsonFilePath, @Optional String jsonDirectory, @Optional String applicationType, @Optional String url, @Optional String browser,
                          @Optional String browserVersion, @Optional String device, @Optional String os_version,
                          @Optional String URI, @Optional String version, @Optional String adminUserName, @Optional String adminPassword, @Optional String isJWT, @Optional String endpointPrefix,
                          @Optional String memberUserName, @Optional String memberPassword, @Optional String adminUrl, @Optional String editorPassword,
                          @Optional String memberUrl, @Optional String coachUrl, @Optional String coachUserName,
                          @Optional String coachPassword, @Optional String editorUrl, @Optional String editorUserName, @Optional String test_region, @Optional String browserstack_execution_local,@Optional String bs_app_path,@Optional String productName) {
        classInitialization(context, xmlTest, testEnvPath, excelFilePath, jsonFilePath, jsonDirectory, applicationType, url, browser, browserVersion, device, os_version, URI, version, adminUserName, adminPassword, isJWT, endpointPrefix, memberUserName, memberPassword, adminUrl, editorPassword, memberUrl, coachUrl, coachUserName, coachPassword, editorUrl, editorUserName, test_region, browserstack_execution_local,bs_app_path,productName);

    }

    @BeforeMethod(alwaysRun = true)
    @Parameters({"testEnvPath", "excelFilePath", "jsonFilePath", "jsonDirectory", "applicationType", "url", "browser", "browser_version", "device", "os_version", "URI", "version", "adminUserName","adminPassword", "isJWT", "endpointPrefix", "memberUserName", "memberPassword", "adminUrl", "editorPassword", "memberUrl", "coachUrl", "coachUserName", "coachPassword", "editorUrl", "editorUserName", "test_region", "browserstack_execution_local","bs_app_path","productName"})
    public void methodInit(ITestContext context, XmlTest xmlTest, Method method, @Optional String testEnvPath, @Optional String excelFilePath,
                           @Optional String jsonFilePath, @Optional String jsonDirectory, @Optional String applicationType, @Optional String url, @Optional String browser,
                           @Optional String browserVersion, @Optional String device, @Optional String os_version,
                           @Optional String URI, @Optional String version, @Optional String adminUserName, @Optional String adminPassword, @Optional String isJWT, @Optional String endpointPrefix,
                           @Optional String memberUserName, @Optional String memberPassword, @Optional String adminUrl, @Optional String editorPassword,
                           @Optional String memberUrl, @Optional String coachUrl, @Optional String coachUserName,
                           @Optional String coachPassword, @Optional String editorUrl, @Optional String editorUserName, @Optional String test_region, @Optional String browserstack_execution_local,@Optional String bs_app_path,@Optional String productName) {
        setUp(context, xmlTest, method, testEnvPath, excelFilePath, jsonFilePath, jsonDirectory, applicationType, url, browser, browserVersion, device, os_version, URI, version, adminUserName, adminPassword, isJWT, endpointPrefix, memberUserName, memberPassword, adminUrl, editorPassword, memberUrl, coachUrl, coachUserName, coachPassword, editorUrl, editorUserName, test_region, browserstack_execution_local,bs_app_path,productName);
    }

}
