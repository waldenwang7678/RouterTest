package com.wangjt.routertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/test/CActivity")
public class CActivity extends AppCompatActivity {
    @Autowired
    public String name;

    @Autowired
    int age;
    @Autowired(name = "girl")
    boolean boy;
    @Autowired
    TestObj obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        ARouter.getInstance().inject(this);
        init();
    }

    private void init() {
        setTitle("CActivity");
        Log.d("asd", "init: " + name + age + boy);
    }
}
