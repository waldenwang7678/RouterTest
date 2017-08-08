package com.wangjt.routertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.interrupt).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_1:
                intentInto();
                break;
            case R.id.bt_2:
                intentWithParams();
                break;
            case R.id.interrupt:
                interrupt();
                break;
        }
    }

    private void interrupt() {
        ARouter.getInstance().build("/test/CActivity").navigation(this, new NavCallback() {
            @Override
            public void onArrival(Postcard postcard) {
                Log.d("asdasd", "onArrival: oh pass~");
            }

            @Override
            public void onInterrupt(Postcard postcard) {
                super.onInterrupt(postcard);
                Log.d("asdasd", "onInterrupt: shit!, interrupt!");
            }
        });
    }

    private void intentInto() {
        ARouter.getInstance().build("/test/BActivity").navigation();
    }

    private void intentWithParams() {
        ARouter.getInstance().build("/test/BActivity")
                .withLong("key1", 666L)
                .withString("key3", "888")
                .navigation();
    }
}
