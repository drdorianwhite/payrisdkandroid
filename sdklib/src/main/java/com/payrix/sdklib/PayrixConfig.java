package com.payrix.sdklib;

/**
 * Created by Administrator on 3/10/2018.
 */

public class PayrixConfig {
    public static final String BASE_URL = "https://test-api.splashpayments.com";
    private static String API_KEY = null;

    public static void setAPIKey(String _apiKey) throws PayrixException{
        if (_apiKey == null || _apiKey.length() < 2)
            throw new   PayrixConfigurationException("bad api key supplied");
        API_KEY = _apiKey;
    }

    public static String getAPIKey()throws PayrixConfigurationException {
        if(API_KEY == null) {
            throw new PayrixConfigurationException("api key not set!");
        }
        return API_KEY;
    }
}
