package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseDetails {

    @SerializedName("requestId")
    @Expose
    private Integer requestId;
    @SerializedName("totals")
    @Expose
    private List<Object> totals = null;
    @SerializedName("page")
    @Expose
    private ResponsePage responsePage;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public List<Object> getTotals() {
        return totals;
    }

    public void setTotals(List<Object> totals) {
        this.totals = totals;
    }

    public ResponsePage getPage() {
        return responsePage;
    }

    public void setPage(ResponsePage responsePageage) {
        this.responsePage = responsePageage;
    }

}