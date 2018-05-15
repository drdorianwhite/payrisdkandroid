package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.payrix.sdklib.data.model.PayrixEntityModel;

public class SubscriptionModel  extends PayrixEntityModel {

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
    @SerializedName("plan")
    @Expose
    private String plan;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("finish")
    @Expose
    private Object finish;
    @SerializedName("tax")
    @Expose
    private Integer tax;
    @SerializedName("descriptor")
    @Expose
    private String descriptor;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;

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

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Object getFinish() {
        return finish;
    }

    public void setFinish(Object finish) {
        this.finish = finish;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
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

}
