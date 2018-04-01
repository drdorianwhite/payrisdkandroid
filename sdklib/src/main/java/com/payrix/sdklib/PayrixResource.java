package com.payrix.sdklib;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.data.model.*;
import com.payrix.sdklib.data.remote.IPayrixService;
import com.payrix.sdklib.data.remote.QueryFilterOptions;

import retrofit2.*;

public abstract class PayrixResource {
    public static String relativeUrl;
    protected IPayrixService service;

    protected PayrixResource(IPayrixService service) throws PayrixException {
        this.service = service;

        if(service == null) throw new PayrixInternalException();
    }

    protected void handleResponse(Call<PayrixAPIResponse> call, final IPayrixResponseCallback callback) throws PayrixException {

        call.clone().enqueue(new Callback<PayrixAPIResponse>() {
            @Override
            public void onResponse(Call<PayrixAPIResponse>call, Response<PayrixAPIResponse> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<PayrixAPIResponse>call, Throwable t) {
                callback.onFailure(t);
            }
        });
    }

    abstract public void create(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void update(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void retrieve(QueryFilterOptions options, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void delete(String id, IPayrixResponseCallback callback) throws PayrixException;
}
