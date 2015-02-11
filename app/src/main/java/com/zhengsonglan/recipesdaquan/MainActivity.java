package com.zhengsonglan.recipesdaquan;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 程序主界面
 */
public class MainActivity extends BaseActivity {
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
        tv_tb_title= (TextView) findViewById(R.id.unit_topbar_tv_title);
        tv_tb_title.setText("菜谱大全");
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
        tv_tb_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("title");
            }
        });
    }

}
