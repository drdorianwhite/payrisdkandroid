package com.payrix.sdklib;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class PayrixAccountUnitTest {


    /*public void accountCreateWorks() throws Exception {
        try {
            PayrixConfig.setAPIKey("ea29716caf7d4b6c42a28798e06d1f5d");
            PayrixAccountData data =  new PayrixAccountData();
            PayrixAccountInfo accountInfo = new PayrixAccountInfo();
            accountInfo.method = "0";
            accountInfo.number = "5";
            accountInfo.routingCode = "asdfasd";
            PayrixAccount account = new PayrixAccount(data);
            account.create(new PayrixEntity.IPayrixAPIResponseHandler() {
                @Override
                public void onSuccess(PayrixEntity.PayrixAPIResponse response) {
                    return;
                }

                @Override
                public void onFailure(PayrixEntity.PayrixErrorResponse response) {
                    fail();
                }
            });
        } catch(PayrixException e) {
            fail();
        }
    }
    */
}