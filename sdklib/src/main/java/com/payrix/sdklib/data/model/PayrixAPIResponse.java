package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class PayrixAPIResponse<T extends PayrixEntityModel> {

    @SerializedName("response")
    @Expose
    private PayrixAPIResponseContents<T> response = null;

    public PayrixAPIResponse() {
        response = new PayrixAPIResponseContents<T>();
    }

    public PayrixAPIResponseContents<T> getResponse() {
        return response;
    }

    public void setResponse(PayrixAPIResponseContents<T> response) {
        this.response = response;
    }
}
