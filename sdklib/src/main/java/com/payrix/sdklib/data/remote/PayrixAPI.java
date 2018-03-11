package com.payrix.sdklib.data.remote;

import com.payrix.sdklib.PayrixConfig;
import com.payrix.sdklib.PayrixException;


/**
 * Created by Administrator on 3/11/2018.
 */

public class PayrixAPI {

    public static IAccountService getAccountService() throws PayrixException {
        return RetrofitClient.getClient(PayrixConfig.getAPIKey()).create(IAccountService.class);
    }
}