package com.payrix.sdklib;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class PayrixAccountTest {
    @Test
    public void accountCreateWorks() throws Exception {
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

}
