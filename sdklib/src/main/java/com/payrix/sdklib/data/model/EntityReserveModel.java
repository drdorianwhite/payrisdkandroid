package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class EntityReserveModel  extends PayrixEntityModel {


    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("fund")
    @Expose
    private String fund;

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;

}
