package com.payrix.sdklib;

import android.support.test.runner.AndroidJUnit4;
import java.util.*;
import com.payrix.sdklib.data.model.EntityFields;
import com.payrix.sdklib.data.model.PayrixAPIError;
import com.payrix.sdklib.data.model.ResponseDetails;
import com.payrix.sdklib.data.model.PayrixEntityModel;
import com.payrix.sdklib.data.model.AccountModel;
import com.payrix.sdklib.data.model.PayrixAPIResponse;
import com.payrix.sdklib.data.remote.PayrixAPI;
import com.payrix.sdklib.data.remote.QueryFilterOptions;

import org.awaitility.Awaitility;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.fail;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class PayrixAccountTest {
    @Test//(timeout = 5000)
    public void accountRetrieveWorks() throws Exception {
        final AtomicBoolean atomic = new AtomicBoolean(false);

        try {
            PayrixConfig.setAPIKey("ea29716caf7d4b6c42a28798e06d1f5d");
            Accounts accounts = PayrixAPI.getAccounts();

            accounts.retrieve(new QueryFilterOptions(), new IPayrixResponseCallback() {
                @Override
                public void onSuccess(PayrixAPIResponse response) {
                    List<PayrixAPIError> errors = response.getErrors();
                    ResponseDetails details = response.getDetails();
                    List<PayrixEntityModel> accounts = (List<PayrixEntityModel>)response.getEntities();

                    for (PayrixEntityModel entity: accounts)
                    {
                        AccountModel account = (AccountModel)entity;
                        account = account;
                    }
                    assert (response.getErrors() != null);
                    atomic.set(true);
                }

                @Override
                public void onFailure(Throwable t) {
                    fail();
                }
            });

        } catch (PayrixException e) {
            fail();
        }

        Awaitility.await().untilTrue(atomic);
    }

    @Test//(timeout = 5000)
    public void accountCreateWorks() throws Exception {
        final AtomicBoolean atomic = new AtomicBoolean(false);

        try {
            PayrixConfig.setAPIKey("ea29716caf7d4b6c42a28798e06d1f5d");
            Accounts accounts = PayrixAPI.getAccounts();

            EntityFields fields = new EntityFields();
            fields.put("account[method]", "0");
            fields.put("account[number]", "5");
            fields.put("account[routing]", "qwer1234");

            accounts.retrieve(new QueryFilterOptions(),  new IPayrixResponseCallback() {
                @Override
                public void onSuccess(PayrixAPIResponse response) {

                    assert(response.getErrors() != null);
                    atomic.set(true);
                }

                @Override
                public void onFailure(Throwable t) {
                    fail();
                }
            });

            accounts.create(fields, new IPayrixResponseCallback() {
                @Override
                public void onSuccess(PayrixAPIResponse response) {

                    assert(response.getErrors() != null);
                    atomic.set(true);
                }

                @Override
                public void onFailure(Throwable t) {

                    fail();
                }
            });

            atomic.set(true);
        }
         catch(PayrixException e) {
            fail();
        }

        Awaitility.await().untilTrue(atomic);
    }
}

