package com.wangjt.routertest;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;

/**
 * Created by wangjt on 2017/8/7.
 */

@Route(path = "/service/json")
public class JsonServiceImpl implements SerializationService {
    @Override
    public void init(Context context) {

    }

    @Override
    public <T> T json2Object(String text, Class<T> clazz) {
        return null;
    }

    @Override
    public String object2Json(Object instance) {
        return instance.toString();
    }
}
