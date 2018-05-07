package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class PayrixAPIResponse {

    @SerializedName("response")
    @Expose
    private PayrixAPIResponseContents response = null;


    public PayrixAPIResponseContents geResponse() {
        return response;
    }

    public void setResponse(PayrixAPIResponseContents) {
        this.response = response;
    }
}
