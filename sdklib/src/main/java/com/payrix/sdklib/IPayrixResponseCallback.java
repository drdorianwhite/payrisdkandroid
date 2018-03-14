package com.payrix.sdklib;

import com.payrix.sdklib.data.model.PayrixAPIResponse;

/**
 * Created by Administrator on 3/12/2018.
 */

public interface IPayrixResponseCallback {
    void onSuccess(PayrixAPIResponse response);
    void onFailure(Throwable t);
}
