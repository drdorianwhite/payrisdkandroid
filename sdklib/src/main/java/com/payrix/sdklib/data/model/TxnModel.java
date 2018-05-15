package com.payrix.sdklib.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TxnModel  extends PayrixEntityModel{

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
    @SerializedName("merchant")
    @Expose
    private String merchant;
    @SerializedName("token")
    @Expose
    private Object token;
    @SerializedName("fortxn")
    @Expose
    private Object fortxn;
    @SerializedName("fromtxn")
    @Expose
    private Object fromtxn;
    @SerializedName("batch")
    @Expose
    private String batch;
    @SerializedName("subscription")
    @Expose
    private Object subscription;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("expiration")
    @Expose
    private String expiration;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("authDate")
    @Expose
    private Object authDate;
    @SerializedName("authCode")
    @Expose
    private Object authCode;
    @SerializedName("captured")
    @Expose
    private String captured;
    @SerializedName("settled")
    @Expose
    private Integer settled;
    @SerializedName("settledCurrency")
    @Expose
    private String settledCurrency;
    @SerializedName("settledTotal")
    @Expose
    private Integer settledTotal;
    @SerializedName("allowPartial")
    @Expose
    private Integer allowPartial;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("descriptor")
    @Expose
    private String descriptor;
    @SerializedName("terminal")
    @Expose
    private Object terminal;
    @SerializedName("terminalCapability")
    @Expose
    private Object terminalCapability;
    @SerializedName("entryMode")
    @Expose
    private Object entryMode;
    @SerializedName("origin")
    @Expose
    private Integer origin;
    @SerializedName("tax")
    @Expose
    private Integer tax;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("cashback")
    @Expose
    private Integer cashback;
    @SerializedName("authorization")
    @Expose
    private String authorization;
    @SerializedName("approved")
    @Expose
    private Integer approved;
    @SerializedName("cvv")
    @Expose
    private Integer cvv;
    @SerializedName("swiped")
    @Expose
    private Integer swiped;
    @SerializedName("emv")
    @Expose
    private Integer emv;
    @SerializedName("signature")
    @Expose
    private Integer signature;
    @SerializedName("unattended")
    @Expose
    private Object unattended;
    @SerializedName("clientIp")
    @Expose
    private String clientIp;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("middle")
    @Expose
    private Object middle;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address1")
    @Expose
    private Object address1;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private Object state;
    @SerializedName("zip")
    @Expose
    private Object zip;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("refunded")
    @Expose
    private Integer refunded;
    @SerializedName("reserved")
    @Expose
    private Integer reserved;
    @SerializedName("misused")
    @Expose
    private Integer misused;
    @SerializedName("checkStage")
    @Expose
    private String checkStage;
    @SerializedName("inactive")
    @Expose
    private Integer inactive;
    @SerializedName("frozen")
    @Expose
    private Integer frozen;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("shipping")
    @Expose
    private Integer shipping;
    @SerializedName("duty")
    @Expose
    private Integer duty;

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

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Object getToken() {
        return token;
    }

    public void setToken(Object token) {
        this.token = token;
    }

    public Object getFortxn() {
        return fortxn;
    }

    public void setFortxn(Object fortxn) {
        this.fortxn = fortxn;
    }

    public Object getFromtxn() {
        return fromtxn;
    }

    public void setFromtxn(Object fromtxn) {
        this.fromtxn = fromtxn;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Object getSubscription() {
        return subscription;
    }

    public void setSubscription(Object subscription) {
        this.subscription = subscription;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Object authDate) {
        this.authDate = authDate;
    }

    public Object getAuthCode() {
        return authCode;
    }

    public void setAuthCode(Object authCode) {
        this.authCode = authCode;
    }

    public String getCaptured() {
        return captured;
    }

    public void setCaptured(String captured) {
        this.captured = captured;
    }

    public Integer getSettled() {
        return settled;
    }

    public void setSettled(Integer settled) {
        this.settled = settled;
    }

    public String getSettledCurrency() {
        return settledCurrency;
    }

    public void setSettledCurrency(String settledCurrency) {
        this.settledCurrency = settledCurrency;
    }

    public Integer getSettledTotal() {
        return settledTotal;
    }

    public void setSettledTotal(Integer settledTotal) {
        this.settledTotal = settledTotal;
    }

    public Integer getAllowPartial() {
        return allowPartial;
    }

    public void setAllowPartial(Integer allowPartial) {
        this.allowPartial = allowPartial;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public Object getTerminal() {
        return terminal;
    }

    public void setTerminal(Object terminal) {
        this.terminal = terminal;
    }

    public Object getTerminalCapability() {
        return terminalCapability;
    }

    public void setTerminalCapability(Object terminalCapability) {
        this.terminalCapability = terminalCapability;
    }

    public Object getEntryMode() {
        return entryMode;
    }

    public void setEntryMode(Object entryMode) {
        this.entryMode = entryMode;
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCashback() {
        return cashback;
    }

    public void setCashback(Integer cashback) {
        this.cashback = cashback;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getSwiped() {
        return swiped;
    }

    public void setSwiped(Integer swiped) {
        this.swiped = swiped;
    }

    public Integer getEmv() {
        return emv;
    }

    public void setEmv(Integer emv) {
        this.emv = emv;
    }

    public Integer getSignature() {
        return signature;
    }

    public void setSignature(Integer signature) {
        this.signature = signature;
    }

    public Object getUnattended() {
        return unattended;
    }

    public void setUnattended(Object unattended) {
        this.unattended = unattended;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Object getMiddle() {
        return middle;
    }

    public void setMiddle(Object middle) {
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

    public Object getAddress1() {
        return address1;
    }

    public void setAddress1(Object address1) {
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

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getZip() {
        return zip;
    }

    public void setZip(Object zip) {
        this.zip = zip;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefunded() {
        return refunded;
    }

    public void setRefunded(Integer refunded) {
        this.refunded = refunded;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Integer getMisused() {
        return misused;
    }

    public void setMisused(Integer misused) {
        this.misused = misused;
    }

    public String getCheckStage() {
        return checkStage;
    }

    public void setCheckStage(String checkStage) {
        this.checkStage = checkStage;
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

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getShipping() {
        return shipping;
    }

    public void setShipping(Integer shipping) {
        this.shipping = shipping;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

}
