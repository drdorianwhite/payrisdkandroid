package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlanModel extends PayrixEntityModel{

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
    @SerializedName("merchant")
    @Expose
    private String merchant;
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
    @SerializedName("amount")
    @Expose
    private Integer amount;
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

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
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

    public void setDescription(String description) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
