package com.payrix.sdklib.data.remote;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.data.model.AccountModel;
import com.payrix.sdklib.data.model.EntityFields;
import com.payrix.sdklib.data.model.PayrixAPIResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface IPayrixService {
    @GET("/")
    Call<PayrixAPIResponse> retrieve(@QueryMap QueryFilterOptions options);

    @GET("/{id}")
    Call<PayrixAPIResponse> retrieve(@Path("id") String id);

    @Headers({"Content-Type: application/json"})
    @POST("/")
    Call<PayrixAPIResponse> create(@QueryMap EntityFields newAccountFieldData);

    @Headers({"Content-Type: application/json"})
    @PUT("/{id}")
    Call<PayrixAPIResponse> update(@Path("id") String id, EntityFields updatedFieldData);

    @DELETE("/{id}")
    Call<PayrixAPIResponse> delete(@Path("id") String id);
}

