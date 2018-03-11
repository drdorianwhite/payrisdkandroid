package com.payrix.sdklib;

/**
 * Created by Administrator on 3/8/2018.
 */

public class PayrixResponseException extends PayrixException {
    public PayrixResponseException(String error) {
        errorMessage = error;
    }

    public PayrixResponseException() {
        errorMessage = "";
    }
}

