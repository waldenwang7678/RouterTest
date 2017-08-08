package com.wangjt.routertest;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/**
 * Created by wangjt on 2017/8/8.
 * 拦截跳转 , 这个类不需要调用, 编译处理注解时被引用
 */
@Interceptor(priority = 5)
public class MyInterceptor implements IInterceptor {
    Context context;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        Log.d("asdasd", "process: " + "拦截器执行");
        if (postcard.getPath().equals("/test/CActivity")) {
            callback.onInterrupt(null);
        } else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
