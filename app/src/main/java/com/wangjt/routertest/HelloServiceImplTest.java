
package com.wangjt.routertest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/service/hello_1")
public class HelloServiceImplTest implements HelloService {
    Context mContext;

    @Override
    public void sayHello(String name) {
        Toast.makeText(mContext, "what the matter of you  " + name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {
        mContext = context;
        Log.e("testService", HelloService.class.getName() + " has init.");
    }
}

