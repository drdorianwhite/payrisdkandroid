package com.payrix.sdklib;

import com.payrix.sdklib.data.model.PayrixAPIResponse;
import com.payrix.sdklib.data.model.PayrixEntityModel;

import java.lang.reflect.Type;

/**
 * Created by Administrator on 3/12/2018.
 */

public interface IPayrixResponseCallback<T extends PayrixEntityModel> {
    void onSuccess(PayrixAPIResponse<T> response);
    void onFailure(Throwable t);
}
