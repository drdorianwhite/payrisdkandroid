package com.payrix.sdklib;

import com.payrix.sdklib.data.model.AccountModel;
import com.payrix.sdklib.data.model.EntityFields;


/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.data.model.PayrixAPIResponse;
import com.payrix.sdklib.data.remote.*;
import retrofit2.Call;

public class Accounts extends PayrixResource {
    static {
        PayrixResource.relativeUrl = "accounts";
    }


    public Accounts(IPayrixService service) throws PayrixException {
        super(service);
    }

    @Override
    public void create(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException {
        handleResponse(service.create(relativeUrl, fieldValues), callback);
    }

    @Override
    public void update(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException {
        String id = fieldValues.get("id");
        if(id == null) throw new PayrixException("null id");
        fieldValues.remove("id");
        String pathWithId = relativeUrl + "/" + id;
        Call<PayrixAPIResponse> call = service.update(pathWithId, fieldValues);
        handleResponse(call, callback);
    }

    @Override
    public void retrieve(QueryFilterOptions options, IPayrixResponseCallback callback) throws PayrixException {
        Call<PayrixAPIResponse> call;
        String path = relativeUrl;

        String id = options.get("id");
        if(id != null) {
            path += "/" + id;
            call = service.retrieve(path);
        }
        else {
            call = service.retrieve(path, options);
        }

        handleResponse(call, callback);
    }


    @Override
    public void delete(String id, IPayrixResponseCallback callback) throws PayrixException {
        String pathWithId = relativeUrl + "/" + id;
        Call<PayrixAPIResponse> call = service.delete(pathWithId);
        handleResponse(call, callback);
    }
}
