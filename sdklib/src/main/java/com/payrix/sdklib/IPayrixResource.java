package com.payrix.sdklib;

/**
 * Created by Administrator on 3/11/2018.
 */
import com.payrix.sdklib.data.model.*;
import com.payrix.sdklib.data.remote.QueryFilterOptions;

public interface IPayrixResource {
    void create(EntityFields fieldValues) throws PayrixException;
    void update(EntityFields fieldValues) throws PayrixException;
    void retrieve(QueryFilterOptions options) throws PayrixException;
    void delete(String id) throws PayrixException;
}
