package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReserveModel extends PayrixEntityModel {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("modifier")
    @Expose
    private String modifier;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("org")
    @Expose
    private String org;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("percent")
    @Expose
    private Integer percent;
    @SerializedName("release")
    @Expose
    private Integer release;
    @SerializedName("releaseFactor")
    @Expose
    private Integer releaseFactor;
    @SerializedName("finish")
    @Expose
    private String finish;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;
    @SerializedName("hold")
    @Expose
    private Integer hold;
    @SerializedName("max")
    @Expose
    private Integer max;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

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

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }

    public Integer getReleaseFactor() {
        return releaseFactor;
    }

    public void setReleaseFactor(Integer releaseFactor) {
        this.releaseFactor = releaseFactor;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getFinish() {
        return finish;
    }

    public void setInactive(Integer inactive) {
        this.inactive = inactive;
    }

    public Integer getInactive() {
        return inactive;
    }

    public void setFrozen(Integer frozen) {
        this.frozen = frozen;
    }

    public Integer getFrozen() {
        return frozen;
    }

    public Integer getHold() {
        return hold;
    }

    public void setHold(Integer hold) {
        this.hold = hold;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}