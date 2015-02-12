package com.zhengsonglan.recipesdaquan;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.srain.cube.image.*;

/**
 * 程序主界面
 */
public class MainActivity extends BaseActivity {
    private TextView tv_tb_title;
    private CubeImageView iv_img;


    ImageLoader imageLoader;

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
    private void initView() {
        tv_tb_title = (TextView) findViewById(R.id.unit_topbar_tv_title);
        tv_tb_title.setText("菜谱大全");
        iv_img = (CubeImageView) findViewById(R.id.main_iv_img);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        imageLoader = ImageLoaderFactory.create(this);
        iv_img.loadImage(imageLoader, "http://img5.imgtn.bdimg.com/it/u=1482866412,2033620421&fm=23&gp=0.jpg");
    }

    /**
     * 初始化时间
     */
    private void initEvent() {
        tv_tb_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("title");
            }
        });
    }

}
