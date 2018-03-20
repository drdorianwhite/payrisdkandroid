package com.payrix.sdklib;

/**
 * Created by Administrator on 3/11/2018.
 */
import android.util.Log;

import com.google.gson.Gson;
import com.payrix.sdklib.data.model.*;
import com.payrix.sdklib.data.remote.IPayrixService;
import com.payrix.sdklib.data.remote.QueryFilterOptions;
import org.json.*;

import java.io.IOException;

import retrofit2.*;

public abstract class PayrixResource {
    public static String resourceUrl;

    protected IPayrixService service;

    protected PayrixResource(IPayrixService service) throws PayrixException {
        this.service = service;

        if(service == null) throw new PayrixInternalException();
    }

    protected void handleResponse(Call<PayrixAPIResponse> call, final IPayrixResponseCallback callback) throws PayrixException {
        try {
            //PayrixAPIResponse response = call.execute().body();
            PayrixAPIResponse response = call.clone().execute().body();
            String json = new Gson().toJson(response.toString());
            assert (json != "" && json != null);
            assert(json.length() > 4);

            try {
                JSONObject jsonObject = new JSONObject(json);
            }
            catch(JSONException e) {
                throw new PayrixResponseException(e.getMessage());
            }

            /*
            assert (response != null);
            assert (response.getErrors().size() == 0);
            assert (response.getEntities() != null);
            assert(response.getEntities().size() > 0);
            PayrixEntityModel entity = response.getEntities().get(0);
            assert (entity != null);
            new Gson().toJson(response)
            */
        }
        catch(IOException e) {
            throw new PayrixResponseException(e.getMessage());
        }
        /*
        call.enqueue(new Callback<PayrixAPIResponse>() {
            @Override
            public void onResponse(Call<PayrixAPIResponse>call, Response<PayrixAPIResponse> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<PayrixAPIResponse>call, Throwable t) {
                callback.onFailure(t);
            }
        });
        */

    }

    abstract public void create(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void update(EntityFields fieldValues, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void retrieve(QueryFilterOptions options, IPayrixResponseCallback callback) throws PayrixException;
    abstract public void delete(String id, IPayrixResponseCallback callback) throws PayrixException;
}
