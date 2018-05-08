package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class PayrixAPIResponseContents<T> {

    @SerializedName("data")
    @Expose
    private List<T> entities = null;
    @SerializedName("details")
    @Expose
    private ResponseDetails details;
    @SerializedName("errors")
    @Expose
    private List<PayrixAPIError> errors = null;

    public PayrixAPIResponseContents() {

    }

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    public ResponseDetails getDetails() {
        return details;
    }

    public void setDetails(ResponseDetails details) {
        this.details = details;
    }

    public List<PayrixAPIError> getErrors() {
        return errors;
    }

    public void setErrors(List<PayrixAPIError> errors) {
        this.errors = errors;
    }

}
