package com.zhengsonglan.recipesdaquan;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * 基础Activity
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initConfig();
    }

    /**
     * 初始化配置
     */
    private void initConfig() {

    }

    /**
     * 显示Toast
     * @param content 显示的内容
     */
    public void showToast(String content) {
        Toast.makeText(getApplicationContext(),content,Toast.LENGTH_SHORT).show();
    }


}
