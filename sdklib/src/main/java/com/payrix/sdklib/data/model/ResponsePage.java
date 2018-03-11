package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponsePage {

    @SerializedName("current")
    @Expose
    private Integer current;

    @SerializedName("last")
    @Expose
    private Integer last;
    @SerializedName("hasMore")
    @Expose
    private Boolean hasMore;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

}
