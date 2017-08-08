package com.wangjt.routertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/BActivity")
public class BActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        init();
        initView();
    }

    private void initView() {
        findViewById(R.id.b_bt1).setOnClickListener(this);
    }

    private void init() {
        setTitle("BActivity");
        Intent intent = getIntent();
        int key1 = intent.getIntExtra("key1", 0);
        String key3 = intent.getStringExtra("key3");
        Toast.makeText(this, "key1 : " + key1 + " key3 : " + key3, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_bt1:
                intentByURL();
                break;
        }
    }

    private void intentByURL() {

    }
}
