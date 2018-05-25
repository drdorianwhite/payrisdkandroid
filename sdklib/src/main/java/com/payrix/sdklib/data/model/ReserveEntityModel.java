package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReserveEntityModel  extends PayrixEntityModel {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("fund")
    @Expose
    private String fund;

    @SerializedName("hold")
    @Expose
    private Integer hold;

    @SerializedName("txn")
    @Expose
    private String txn;

    @SerializedName("reserve")
    @Expose
    private String reserve;

    @SerializedName("entityReserve")
    @Expose
    private String entityReserve;


    @SerializedName("reserveEntry")
    @Expose
    private String reserveEntry;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("amount")
    @Expose
    private Integer amount;

    @SerializedName("release")
    @Expose
    private String release;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public Integer getHold() {
        return hold;
    }

    public void setHold(Integer hold) {
        this.hold = hold;
    }

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public String getReserve() {
        return reserve;
    }

    public void setEntityReserve(String entityReserve) {
        this.entityReserve = entityReserve;
    }

    public String getEntityReserve() {
        return entityReserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getReserveEntry() {
        return reserveEntry;
    }

    public void setReserveEntry(String reserveEntry) {
        this.reserveEntry = reserveEntry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String  description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String  release) {
        this.release = release;
    }
}
