package com.payrix.sdklib;

/**
 * Created by Administrator on 3/8/2018.
 */

public  class PayrixException extends Throwable {

    public String errorMessage;

    public PayrixException(String error) {
        errorMessage = error;
    }

    public PayrixException() {
        errorMessage = "";
    }
}
