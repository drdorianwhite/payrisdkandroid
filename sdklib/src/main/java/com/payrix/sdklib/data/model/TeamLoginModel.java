package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamLoginModel extends PayrixEntityModel {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("team")
    @Expose
    private String team;
    @SerializedName("create")
    @Expose
    private Integer create;
    @SerializedName("read")
    @Expose
    private Integer read;
    @SerializedName("update")
    @Expose
    private Integer update;
    @SerializedName("delete")
    @Expose
    private Integer delete;
    @SerializedName("reference")
    @Expose
    private Integer reference;
    @SerializedName("teamAdmin")
    @Expose
    private Integer teamAdmin;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getCreate() {
        return create;
    }

    public void setCreate(Integer create) {
        this.create = create;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
        this.update = update;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public Integer getTeamAdmin() {
        return teamAdmin;
    }

    public void setTeamAdmin(Integer teamAdmin) {
        this.teamAdmin = teamAdmin;
    }
}