package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayoutModel extends PayrixEntityModel {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("account")
    @Expose
    private String account;
    @SerializedName("payFlow")
    @Expose
    private String payFlow;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("schedule")
    @Expose
    private Integer schedule;
    @SerializedName("scheduleFactor")
    @Expose
    private Integer scheduleFactor;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("um")
    @Expose
    private Integer um;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("minimum")
    @Expose
    private Integer minimum;
    @SerializedName("skipOffDays")
    @Expose
    private Integer skipOffDays;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPayFlow() {
        return payFlow;
    }

    public void setPayFlow(String payFlow) {
        this.payFlow = payFlow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String  description) {
        this.description = description;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    public Integer getScheduleFactor() {
        return scheduleFactor;
    }

    public void setScheduleFactor(Integer scheduleFactor) {
        this.scheduleFactor = scheduleFactor;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setUm(Integer um) {
        this.um = um;
    }

    public Integer getUm() {
        return um;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setSkipOffDays(Integer skipOffDays) {
        this.skipOffDays = skipOffDays;
    }

    public Integer getSkipOffDays() {
        return skipOffDays;
    }

    public void setInactive(Integer inactive) {
        this.inactive = inactive;
    }

    public Integer getInactive() {
        return inactive;
    }
}