package com.payrix.sdklib.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerModel extends PayrixEntityModel {

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
    @SerializedName("merchant")
    @Expose
    private Object merchant;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("middle")
    @Expose
    private String middle;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("fax")
    @Expose
    private Object fax;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;
    @SerializedName("shippingFirst")
    @Expose
    private String shippingFirst;
    @SerializedName("shippingMiddle")
    @Expose
    private Object shippingMiddle;
    @SerializedName("shippingLast")
    @Expose
    private Object shippingLast;
    @SerializedName("shippingCompany")
    @Expose
    private String shippingCompany;
    @SerializedName("shippingAddress1")
    @Expose
    private String shippingAddress1;
    @SerializedName("shippingAddress2")
    @Expose
    private String shippingAddress2;
    @SerializedName("shippingCity")
    @Expose
    private Object shippingCity;
    @SerializedName("shippingState")
    @Expose
    private Object shippingState;
    @SerializedName("shippingZip")
    @Expose
    private String shippingZip;
    @SerializedName("shippingCountry")
    @Expose
    private Object shippingCountry;
    @SerializedName("shippingPhone")
    @Expose
    private Object shippingPhone;
    @SerializedName("shippingFax")
    @Expose
    private Object shippingFax;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Object getMerchant() {
        return merchant;
    }

    public void setMerchant(Object merchant) {
        this.merchant = merchant;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
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

    public String getShippingFirst() {
        return shippingFirst;
    }

    public void setShippingFirst(String shippingFirst) {
        this.shippingFirst = shippingFirst;
    }

    public Object getShippingMiddle() {
        return shippingMiddle;
    }

    public void setShippingMiddle(Object shippingMiddle) {
        this.shippingMiddle = shippingMiddle;
    }

    public Object getShippingLast() {
        return shippingLast;
    }

    public void setShippingLast(Object shippingLast) {
        this.shippingLast = shippingLast;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getShippingAddress1() {
        return shippingAddress1;
    }

    public void setShippingAddress1(String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public String getShippingAddress2() {
        return shippingAddress2;
    }

    public void setShippingAddress2(String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public Object getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(Object shippingCity) {
        this.shippingCity = shippingCity;
    }

    public Object getShippingState() {
        return shippingState;
    }

    public void setShippingState(Object shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public Object getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(Object shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public Object getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(Object shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public Object getShippingFax() {
        return shippingFax;
    }

    public void setShippingFax(Object shippingFax) {
        this.shippingFax = shippingFax;
    }

}