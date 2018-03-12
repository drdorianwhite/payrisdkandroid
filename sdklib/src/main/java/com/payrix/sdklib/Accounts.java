package com.payrix.sdklib;

import com.payrix.sdklib.data.model.AccountModel;
import com.payrix.sdklib.data.model.EntityFields;
import com.payrix.sdklib.data.remote.IAccountService;

/**
 * Created by Administrator on 3/11/2018.
 */

import com.payrix.sdklib.data.remote.*;

public class Accounts implements IPayrixResource {
    IAccountService service;

    public Accounts() throws PayrixException {
        service = PayrixAPI.getAccountService();
    }

    @Override
    public void create(EntityFields fieldValues) throws PayrixException {

        service.createAccount(fieldValues);
    }

    @Override
    public void update(EntityFields fieldValues) throws PayrixException {

    }

    @Override
    public void retrieve(QueryFilterOptions options) throws PayrixException {

    }


    @Override
    public void delete(String id) throws PayrixException {

    }
}
