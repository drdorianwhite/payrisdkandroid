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
    @GET
    @Headers({"Content-Type: application/json"})
    Call<PayrixAPIResponse> retrieve(@Url String path, @HeaderMap QueryFilterOptions options);

    @GET
    @Headers({"Content-Type: application/json"})
    Call<PayrixAPIResponse> retrieve(@Url String pathWithId);

    @Headers({"Content-Type: application/json"})
    @POST
    @FormUrlEncoded
    Call<PayrixAPIResponse> create(@Url String path, @FieldMap EntityFields newAccountFieldData);

    @Headers({"Content-Type: application/json"})
    @PUT
    @FormUrlEncoded
    Call<PayrixAPIResponse> update(@Url String pathWithId, @FieldMap  EntityFields updatedFieldData);

    @DELETE("/{id}")
    @Headers({"Content-Type: application/json"})
    Call<PayrixAPIResponse> delete(@Url String pathWithId);
}

