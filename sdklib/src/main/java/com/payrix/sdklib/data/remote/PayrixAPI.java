package com.payrix.sdklib.data.remote;

import com.payrix.sdklib.Accounts;
import com.payrix.sdklib.IPayrixResponseCallback;
import com.payrix.sdklib.PayrixConfig;
import com.payrix.sdklib.PayrixException;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 3/11/2018.
 */

public class PayrixAPI {
    public static Accounts getAccounts() throws PayrixException {
        String resourceUrl = Accounts.resourceUrl;
        IPayrixService service = RetrofitClient.getClient(resourceUrl).create(IPayrixService.class);
        return new Accounts(service);
    }
}