package com.payrix.sdklib.data.model;

/**
 * Created by Administrator on 3/11/2018.
 */
import com.payrix.sdklib.PayrixException;

import java.lang.reflect.*;
import java.util.*;

public abstract class PayrixEntityModel {
    private EntityFields fieldData;

    public PayrixEntityModel() {
        fieldData = new EntityFields();
    }

    void loadFromFieldData(EntityFields fieldData) throws PayrixException {
        this.fieldData = fieldData;

        if(fieldData != null) {
            for(Map.Entry<String, String> entry : fieldData.entrySet()) {
                try {
                    Field field = this.getClass().getDeclaredField(entry.getKey());
                    field.set(entry.getKey(), entry.getValue());
                } catch (NoSuchFieldException e) {
                    throw new PayrixException("bad field data");
                } catch (IllegalAccessException e) {
                    throw new PayrixException("bad field data");
                }
            }
        }
    }

    public void setField(String name, String value) throws PayrixException {
        if(name == null || name == "")
            throw new PayrixException("bad field value");

        this.fieldData.put(name, value);

        try {
            Field field =  this.getClass().getDeclaredField(name);
            field.set(name, value);
        } catch (IllegalAccessException e) {
            throw new PayrixException("erroneous field data added to model.");
        } catch (NoSuchFieldException e) {
            throw new PayrixException("erroneous field data added to model.");
        }
    }
}
