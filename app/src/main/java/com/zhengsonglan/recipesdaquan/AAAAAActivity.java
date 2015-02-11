package com.zhengsonglan.recipesdaquan;

import android.os.Bundle;
import android.widget.TextView;

/**
 * 程序主界面
 */
public class AAAAAActivity extends BaseActivity {
    private TextView tv_tb_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
        initData();
    }

    /**
     * 初始化视图
     */
    private void initView(){

    }

    /**
     * 初始化数据
     */
    private void initData(){
    }

    /**
     * 初始化时间
     */
    private void initEvent(){

    }

}
