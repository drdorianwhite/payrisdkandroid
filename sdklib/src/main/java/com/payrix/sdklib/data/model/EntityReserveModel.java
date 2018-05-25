package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class EntityReserveModel  extends PayrixEntityModel {

    @SerializedName("id")
    @Expose
    private String id;

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

}
