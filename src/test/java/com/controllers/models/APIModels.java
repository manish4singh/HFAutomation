package com.controllers.models;

import com.trigon.api.APICoreController;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIModels extends APICoreController {


    public Map<String, Object> headers;
    public Map<String, Object> queryParams;
    public Map<String, Object> formParams;
    public Map<String, Object> pathParams;
    public Map<String, Object> expectedResponse;
    public Map<String, Object> cookies;

    public APIModels() {
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        formParams = new HashMap<>();
        pathParams = new HashMap<>();
        expectedResponse = new HashMap<>();
    }

    /**
     * Use this method to pick data directly from your Test Data
     *
     * @param tData          : Pass TestData Provider Map here
     * @param requiredNewMap : Pass required Map: For example, headers Map or expectedResponseMap
     * @param Key:           Use the key which you need to pick from TestData
     */
    public void addDataToMapWithKey(HashMap<String, Object> tData, Map<String, Object> requiredNewMap, String Key) {
        addDataToMapWithKeyImpl(tData, requiredNewMap, Key);
    }


    public Response validateStaticResponse() {
        return validateStaticRespImpl();
    }

    /**
     * @param actualResponseMap : Pass Actual response Map
     * @param contains          : Pass the key which you are looking, All matching keys along with values will add to map
     * @return : It returns all filered data from contains
     */
    public Map<String, Object> filterStaticDataFromActualResponse(Map<String, Object> actualResponseMap, String contains) {
        return filterStaticDataFromActualResponseImpl(actualResponseMap, contains);
    }

    /**
     * Use this , whene ever there is dynamic response and you need to get the keys & values of matching known key and known value
     *
     * @param actualResponseMap :Pass Actual response Map
     * @param knownKey          : Pass Known Key
     * @param knownValue        : Pass associated know value
     * @param requiredKeys      : Add all required keys : example, "Key1","Key2"
     * @return All matching keys from required keys will return
     */
    public Map<String, Object> filterDynamicDataFromActualResponse(Map<String, Object> actualResponseMap, String knownKey, String knownValue, String... requiredKeys) {
        return filterDynamicDataFromActualResponseImpl(actualResponseMap, knownKey, knownValue, requiredKeys);
    }

    public Map<String, Object> decodeResponseByte(String byteString) {
        return decodeResponseByteImpl(byteString);
    }

    // Added below methods to

    /**
     * Use this method when ever you are hitting endpoint in a Loop, This will help to avoid adding huge data to report
     *
     * @param HttpMethod         : You can pass parameter based on your request [POST,GET,PUT,DELETE,PATCH]
     * @param Endpoint           : Pass your Endpoint, not the full URI
     * @param requestBody        : Prepare reqyest body as String
     *                           Usage:
     *                           String body = ""{\n" +
     *                           "        \"consent_by\": \"CUSTOMER\",\n" +
     *                           "        \"customer_id\": \"" + custid + "\",\n" +
     *                           "        \"action\": \""+action+"\",\n" +
     *                           "        \"platform_id\": "+platformid+",\n" +
     *                           "        \"device\": \"{\\\"os\\\":\\\"Mac\\\"}\"\n" +
     *                           "    }";";
     * @param expectedStatusCode : Pass expected status code as String , Exp "200","201","400".. etc
     * @return : It returns entire response as Map
     */
    public Map<String, Object> sendRequestWithOutReport(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode) {
        return sendRequestWithOutReportImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse);
    }


    /**
     * @param HttpMethod         : You can pass parameter based on your request [POST,GET,PUT,DELETE,PATCH]
     * @param Endpoint           : Pass your Endpoint, not the full URI
     * @param requestBody        : Prepare reqyest body as String
     *                           Usage:
     *                           String body = ""{\n" +
     *                           "        \"consent_by\": \"CUSTOMER\",\n" +
     *                           "        \"customer_id\": \"" + custid + "\",\n" +
     *                           "        \"action\": \""+action+"\",\n" +
     *                           "        \"platform_id\": "+platformid+",\n" +
     *                           "        \"device\": \"{\\\"os\\\":\\\"Mac\\\"}\"\n" +
     *                           "    }";";
     * @param expectedStatusCode : Pass expected status code as String , Exp "200","201","400".. etc
     * @param multiPartMap       : Put all your files in a map like below
     *                           mutiFormMap.put("profile_image", "path/abc.png");
     * @return
     */
    public Map<String, Object> validateMultiPartResponse(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode, Map<String, Object> multiPartMap) {
        return validateMultiPartResponseImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse, multiPartMap);
    }

    /**
     * @param HttpMethod         : You can pass parameter based on your request [POST,GET,PUT,DELETE,PATCH]
     * @param Endpoint           : Pass your Endpoint, not the full URI
     * @param requestBody        : Prepare reqyest body as String
     *                           Usage:
     *                           String body = ""{\n" +
     *                           "        \"consent_by\": \"CUSTOMER\",\n" +
     *                           "        \"customer_id\": \"" + custid + "\",\n" +
     *                           "        \"action\": \""+action+"\",\n" +
     *                           "        \"platform_id\": "+platformid+",\n" +
     *                           "        \"device\": \"{\\\"os\\\":\\\"Mac\\\"}\"\n" +
     *                           "    }";";
     * @param expectedStatusCode : Pass expected status code as String , Exp "200","201","400".. etc
     * @return
     */
    public Map<String, Object> validateStaticResponse(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode) {
        return validateStaticResponseImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse);
    }


    /**
     * @param HttpMethod         : You can pass parameter based on your request [POST,GET,PUT,DELETE,PATCH]
     * @param Endpoint           : Pass your Endpoint, not the full URI
     * @param requestBody        : Prepare reqyest body as String
     *                           Usage:
     *                           String body = ""{\n" +
     *                           "        \"consent_by\": \"CUSTOMER\",\n" +
     *                           "        \"customer_id\": \"" + custid + "\",\n" +
     *                           "        \"action\": \""+action+"\",\n" +
     *                           "        \"platform_id\": "+platformid+",\n" +
     *                           "        \"device\": \"{\\\"os\\\":\\\"Mac\\\"}\"\n" +
     *                           "    }";";
     * @param expectedStatusCode : Pass expected status code as String , Exp "200","201","400".. etc
     * @return
     */
    public Map<String, Object> validateStaticResponseKeys(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode) {
        return validateStaticResponseKeysImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse);
    }

    /**
     * Use this method when ever there is a response body in array format and dats keep adding/changing
     * Usage: if your response body is like below, use like knownKey is name and knownValue id "TestCat1MBA"
     * {
     * "current_page": 1,
     * "data": [
     * {
     * "id": 1716759,
     * "host": "qa5.hfcdn.com",
     * "name": "TestCat1MBA",
     * "pos": 0,
     * "pos_back": 0,
     * }]
     * }
     *
     * @param HttpMethod         : You can pass parameter based on your request [POST,GET,PUT,DELETE,PATCH]
     * @param Endpoint           : Pass your Endpoint, not the full URI
     * @param requestBody        : Prepare reqyest body as String
     *                           Usage:
     *                           String body = ""{\n" +
     *                           "        \"consent_by\": \"CUSTOMER\",\n" +
     *                           "        \"customer_id\": \"" + custid + "\",\n" +
     *                           "        \"action\": \""+action+"\",\n" +
     *                           "        \"platform_id\": "+platformid+",\n" +
     *                           "        \"device\": \"{\\\"os\\\":\\\"Mac\\\"}\"\n" +
     *                           "    }";";
     * @param knownKey           : Identify the KnownKey from your response and pass here
     * @param knownValue         :Identify the KnownValue from your response and pass here
     * @param expectedStatusCode : Pass expected status code as String , Exp "200","201","400".. etc
     * @return it returns all filtered data
     */
    public Map<String, Object> validateDynamicResponse(String HttpMethod, String Endpoint, String requestBody, String knownKey, String knownValue, String expectedStatusCode) {
        return validateDynamicResponseImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, knownKey, knownValue, expectedStatusCode, expectedResponse);
    }


    /**
     * Use this for any adhoc or sending ThirdParty requests
     *
     * @param HttpMethod
     * @param URI
     * @param Endpoint
     * @param requestBody
     * @param expectedStatusCode
     * @return
     */
    public Map<String, Object> sendAndVerifyRequest(String HttpMethod, String URI, String Endpoint, String requestBody, String expectedStatusCode) {
        return sendRequestImpl(HttpMethod, URI, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse);
    }

    /**
     * This method returns all matching keys mentioned in expectedKeyFromList
     * Example: If you need to return all list of ids from an JSONArray, Use as "data.id" DONOT use any indexes
     *
     * @param HttpMethod
     * @param Endpoint
     * @param requestBody
     * @param expectedStatusCode
     * @param expectedKeyFromList
     * @return
     */
    public List<Object> getStaticResponseList(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode, String expectedKeyFromList) {
        return getStaticResponseListImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedKeyFromList);
    }

    /**
     * Use this request for any adhoc tasks and sending any requests
     *
     * @param HttpMethod
     * @param Endpoint
     * @param requestBody
     * @param expectedStatusCode
     * @return : It returns the entire Response, so that you can create your own parsings.
     */
    public Response sendRequest(String HttpMethod, String Endpoint, String requestBody, String expectedStatusCode) {
        return validateStaticRespImpl(HttpMethod, Endpoint, headers, cookies, queryParams, formParams, pathParams, requestBody, expectedStatusCode, expectedResponse);
    }
}
