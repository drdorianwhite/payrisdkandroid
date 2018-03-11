package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class PayrixAPIError {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("severity")
    @Expose
    private Integer severity;
    @SerializedName("msg")
    @Expose
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
