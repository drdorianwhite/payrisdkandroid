package com.payrix.sdklib.data.remote;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.PayrixConfig;
import com.payrix.sdklib.PayrixConfigurationException;
import com.payrix.sdklib.PayrixException;
import com.payrix.sdklib.PayrixInternalException;

import java.io.*;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import okhttp3.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) throws PayrixException {
        if (retrofit==null) {

            final String apiKey = PayrixConfig.getAPIKey();

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException  {
                    Request original = chain.request();

                    // Request customization: add request headers
                    Request request = original.newBuilder()
                            .header("APIKEY", apiKey)
                            .header("Accept", "application/json")
                            .method(original.method(), original.body())
                            .build();

                    return chain.proceed(request);
                }
            });

            OkHttpClient client = httpClient.build();


            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}

