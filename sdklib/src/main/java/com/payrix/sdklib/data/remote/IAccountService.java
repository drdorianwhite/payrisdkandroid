package com.payrix.sdklib.data.remote;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.data.model.AccountModel;
import com.payrix.sdklib.data.model.EntityFields;
import com.payrix.sdklib.data.model.PayrixAPIResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface IAccountService {
    @GET("/accounts")
    Call<PayrixAPIResponse> getAccounts(@QueryMap QueryFilterOptions options);

    @GET("/account/{id}")
    Call<PayrixAPIResponse> getAccount(@Path("id") String id);

    @Headers({"Content-Type: application/json"})
    @POST("/accounts")
    Call<PayrixAPIResponse> createAccount(EntityFields newAccountFieldData);

    @Headers({"Content-Type: application/json"})
    @PUT("/accounts/{id}")
    Call<PayrixAPIResponse> updateAccount(@Path("id") String id, EntityFields updatedFieldData);

    @DELETE("/accounts/{id}")
    Call<PayrixAPIResponse> deleteAccount(@Path("id") String id);
}

