package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantModel extends PayrixEntityModel {

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
    @SerializedName("lastActivity")
    @Expose
    private Object lastActivity;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("dba")
    @Expose
    private String dba;
    @SerializedName("new")
    @Expose
    private Integer _new;
    @SerializedName("established")
    @Expose
    private Object established;
    @SerializedName("annualCCSales")
    @Expose
    private Integer annualCCSales;
    @SerializedName("avgTicket")
    @Expose
    private Integer avgTicket;
    @SerializedName("amex")
    @Expose
    private Object amex;
    @SerializedName("discover")
    @Expose
    private Object discover;
    @SerializedName("mcc")
    @Expose
    private Object mcc;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("boarded")
    @Expose
    private Object boarded;
    @SerializedName("tcVersion")
    @Expose
    private Integer tcVersion;
    @SerializedName("tcDate")
    @Expose
    private Object tcDate;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;
    @SerializedName("environment")
    @Expose
    private String environment;

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

    public Object getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getDba() {
        return dba;
    }

    public void setDba(String dba) {
        this.dba = dba;
    }

    public Integer getNew() {
        return _new;
    }

    public void setNew(Integer _new) {
        this._new = _new;
    }

    public Object getEstablished() {
        return established;
    }

    public void setEstablished(Object established) {
        this.established = established;
    }

    public Integer getAnnualCCSales() {
        return annualCCSales;
    }

    public void setAnnualCCSales(Integer annualCCSales) {
        this.annualCCSales = annualCCSales;
    }

    public Integer getAvgTicket() {
        return avgTicket;
    }

    public void setAvgTicket(Integer avgTicket) {
        this.avgTicket = avgTicket;
    }

    public Object getAmex() {
        return amex;
    }

    public void setAmex(Object amex) {
        this.amex = amex;
    }

    public Object getDiscover() {
        return discover;
    }

    public void setDiscover(Object discover) {
        this.discover = discover;
    }

    public Object getMcc() {
        return mcc;
    }

    public void setMcc(Object mcc) {
        this.mcc = mcc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getBoarded() {
        return boarded;
    }

    public void setBoarded(Object boarded) {
        this.boarded = boarded;
    }

    public Integer getTcVersion() {
        return tcVersion;
    }

    public void setTcVersion(Integer tcVersion) {
        this.tcVersion = tcVersion;
    }

    public Object getTcDate() {
        return tcDate;
    }

    public void setTcDate(Object tcDate) {
        this.tcDate = tcDate;
    }

    public Integer getInactive() {
        return inactive;
    }

    public void setInactive(Integer inactive) {
        this.inactive = inactive;
    }

    public Integer getFrozen() {
        return frozen;
    }

    public void setFrozen(Integer frozen) {
        this.frozen = frozen;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

}