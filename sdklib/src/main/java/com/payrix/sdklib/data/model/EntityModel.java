package com.payrix.sdklib.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EntityModel extends PayrixEntityModel{

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
    @SerializedName("ipCreated")
    @Expose
    private String ipCreated;
    @SerializedName("ipModified")
    @Expose
    private String ipModified;
    @SerializedName("clientIp")
    @Expose
    private String clientIp;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("parameter")
    @Expose
    private Object parameter;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("fax")
    @Expose
    private Object fax;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("ein")
    @Expose
    private String ein;
    @SerializedName("tcVersion")
    @Expose
    private Object tcVersion;
    @SerializedName("tcDate")
    @Expose
    private Object tcDate;
    @SerializedName("tcIp")
    @Expose
    private Object tcIp;
    @SerializedName("tcAcceptDate")
    @Expose
    private Object tcAcceptDate;
    @SerializedName("tcAcceptIp")
    @Expose
    private String tcAcceptIp;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("custom")
    @Expose
    private String custom;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;
    @SerializedName("tinStatus")
    @Expose
    private Integer tinStatus;
    @SerializedName("reserved")
    @Expose
    private Integer reserved;
    @SerializedName("checkStage")
    @Expose
    private String checkStage;
    @SerializedName("public")
    @Expose
    private Integer _public;

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

    public String getIpCreated() {
        return ipCreated;
    }

    public void setIpCreated(String ipCreated) {
        this.ipCreated = ipCreated;
    }

    public String getIpModified() {
        return ipModified;
    }

    public void setIpModified(String ipModified) {
        this.ipModified = ipModified;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public Object getTcVersion() {
        return tcVersion;
    }

    public void setTcVersion(Object tcVersion) {
        this.tcVersion = tcVersion;
    }

    public Object getTcDate() {
        return tcDate;
    }

    public void setTcDate(Object tcDate) {
        this.tcDate = tcDate;
    }

    public Object getTcIp() {
        return tcIp;
    }

    public void setTcIp(Object tcIp) {
        this.tcIp = tcIp;
    }

    public Object getTcAcceptDate() {
        return tcAcceptDate;
    }

    public void setTcAcceptDate(Object tcAcceptDate) {
        this.tcAcceptDate = tcAcceptDate;
    }

    public String getTcAcceptIp() {
        return tcAcceptIp;
    }

    public void setTcAcceptIp(String tcAcceptIp) {
        this.tcAcceptIp = tcAcceptIp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
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

    public Integer getTinStatus() {
        return tinStatus;
    }

    public void setTinStatus(Integer tinStatus) {
        this.tinStatus = tinStatus;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public String getCheckStage() {
        return checkStage;
    }

    public void setCheckStage(String checkStage) {
        this.checkStage = checkStage;
    }

    public Integer getPublic() {
        return _public;
    }

    public void setPublic(Integer _public) {
        this._public = _public;
    }

}