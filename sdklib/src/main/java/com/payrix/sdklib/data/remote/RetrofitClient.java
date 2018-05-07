package com.payrix.sdklib.data.remote;

/**
 * Created by Administrator on 3/11/2018.
 */

import android.os.Build;
import android.util.Log;

import com.payrix.sdklib.PayrixConfig;
import com.payrix.sdklib.PayrixConfigurationException;
import com.payrix.sdklib.PayrixException;
import com.payrix.sdklib.PayrixInternalException;
import java.io.*;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import okhttp3.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) throws PayrixException {
        if (retrofit==null) {

            final String apiKey = PayrixConfig.getAPIKey();

            Interceptor interceptor = new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException  {
                    Request originalRequest = chain.request();
                    Request alteredRequest = originalRequest.newBuilder()
                            .addHeader("APIKEY", apiKey)
                            .addHeader("Content-Type", "application/json")
                            .method(originalRequest.method(), originalRequest.body())
                            .build();

                    return chain.proceed(alteredRequest);
                }
            };

            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();

            clientBuilder
                    .addInterceptor(interceptor)
                    .followRedirects(true)
                    .followSslRedirects(true)
                    .retryOnConnectionFailure(true)
                    .cache(null)
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .writeTimeout(5, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.SECONDS);

            //OkHttpClient client = enableTls12OnPreLollipop(clientBuilder).build();
            OkHttpClient client = clientBuilder.build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    private static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder clientBuilder) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sc = SSLContext.getInstance("TLSv1.2");
                sc.init(null, null, null);
                clientBuilder.sslSocketFactory(new TLSSocketFactory(sc.getSocketFactory()));

                ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                        .tlsVersions(TlsVersion.TLS_1_2)
                        .build();

                List<ConnectionSpec> specs = new ArrayList<>();
                specs.add(cs);
                specs.add(ConnectionSpec.COMPATIBLE_TLS);
                specs.add(ConnectionSpec.CLEARTEXT);

                clientBuilder.connectionSpecs(specs);
            } catch (Exception exc) {
                Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc);
            }
        }

        return clientBuilder;
    }
}

