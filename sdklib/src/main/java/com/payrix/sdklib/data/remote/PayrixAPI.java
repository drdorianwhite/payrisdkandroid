package com.payrix.sdklib.data.remote;

import com.payrix.sdklib.Accounts;
import com.payrix.sdklib.IPayrixResponseCallback;
import com.payrix.sdklib.PayrixConfig;
import com.payrix.sdklib.PayrixException;
import com.payrix.sdklib.PayrixResource;

import retrofit2.Retrofit;

/**
 * Created by Administrator on 3/11/2018.
 */

public class PayrixAPI {
    public static Accounts getAccounts() throws PayrixException {
        IPayrixService service = RetrofitClient.getClient(PayrixConfig.BASE_URL).create(IPayrixService.class);
        return new Accounts(service);
    }
}