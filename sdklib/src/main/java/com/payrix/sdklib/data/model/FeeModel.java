package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeeModel  extends PayrixEntityModel {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("forentity")
    @Expose
    private String forEntity;
    @SerializedName("org")
    @Expose
    private String org;
    @SerializedName("type")
    @Expose
    private int type;
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
    @SerializedName("finish")
    @Expose
    private String finish;
    @SerializedName("collection")
    @Expose
    private Integer collection;
    @SerializedName("collectionFactor")
    @Expose
    private Integer collectionFactor;
    @SerializedName("collectionOffset")
    @Expose
    private Integer collectionOffset;
    @SerializedName("um")
    @Expose
    private Integer um;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("currency")
    @Expose
    private String currency;
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

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getForEntity() {
        return forEntity;
    }

    public void setForEntity(String forEntity) {
        this.forEntity = forEntity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
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


    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollectionFactor(Integer collectionFactor) {
        this.collectionFactor = collectionFactor;
    }

    public Integer getCollectionFactor() {
        return collectionFactor;
    }

    public void setCollectionOffset(Integer collectionOffset) {
        this.collectionOffset = collectionOffset;
    }

    public Integer getCollectionOffset() {
        return collectionOffset;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getFinish() {
        return finish;
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


}
