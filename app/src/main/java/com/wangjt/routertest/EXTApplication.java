package com.wangjt.routertest;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by wangjt on 2017/8/7.
 */

public class EXTApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter() {
        if (BuildConfig.DEBUGENV) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
