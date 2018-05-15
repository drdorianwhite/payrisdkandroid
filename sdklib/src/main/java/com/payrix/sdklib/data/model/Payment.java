package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payment {
    @SerializedName("method")
    @Expose
    public Integer method;
    @SerializedName("number")
    @Expose
    public String number;
    @SerializedName("routing")
    @Expose
    public String routing;
}
