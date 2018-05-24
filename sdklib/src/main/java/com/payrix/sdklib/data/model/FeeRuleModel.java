package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeeRuleModel  extends PayrixEntityModel {


    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("type")
    @Expose
    private int type;
    @SerializedName("application")
    @Expose
    private int application;
    @SerializedName("value")
    @Expose
    private int value;
    @SerializedName("grouping")
    @Expose
    private String grouping;
    @SerializedName("inactive")
    @Expose
    private int inactive;
    @SerializedName("frozen")
    @Expose
    private int frozen;

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int description) {
        this.type = type;
    }

    public int getApplication() {
        return application;
    }

    public void setApplication(int application) {
        this.application = application;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public int getInactive() {
        return inactive;
    }

    public void setInactive(int inactive) {
        this.inactive = inactive;
    }
}
