package com.payrix.sdklib;
import android.support.test.runner.AndroidJUnit4;
import com.payrix.sdklib.data.model.EntityFields;
import com.payrix.sdklib.data.model.PayrixAPIResponse;
import com.payrix.sdklib.data.remote.PayrixAPI;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.atomic.AtomicBoolean;
import org.awaitility.Awaitility;
import android.util.*;


import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class PayrixAccountTest {
    @Test//(timeout = 5000)
    public void accountCreateFunctions() throws Exception {
        final AtomicBoolean atomic = new AtomicBoolean(false);

        try {
            PayrixConfig.setAPIKey("ea29716caf7d4b6c42a28798e06d1f5d");
            Accounts accounts = PayrixAPI.getAccounts();

            EntityFields fields = new EntityFields();
            fields.put("account[method]", "0");
            fields.put("account[number]", "5");
            fields.put("account[routing]", "qwer1234");


            accounts.create(fields, null /*new IPayrixResponseCallback() {
                @Override
                public void onSuccess(PayrixAPIResponse response) {
                    try {
                        assert(response.toJSON() != null);
                    } catch (PayrixException e) {
                        Log.d("test", e.getMessage());
                        fail();
                    }
                    Log.d("test", response.toString());
                    atomic.set(true);
                }

                @Override
                public void onFailure(Throwable t) {
                    fail();
                }
            })*/);

            //atomic.set(true);
        }
         catch(PayrixException e) {
            fail();
        }

        //Awaitility.await().untilTrue(atomic);
    }
}

