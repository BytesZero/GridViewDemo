package com.zhengsonglan.recipesdaquan;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.zhengsonglan.recipesdaquan.adapter.Main_Adapter;
import com.zhengsonglan.recipesdaquan.entity.Food;
import com.zhengsonglan.recipesdaquan.http.HttpUtil;
import com.zhengsonglan.recipesdaquan.http.Urls;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.image.*;

/**
 * 程序主界面
 */
public class MainActivity extends BaseActivity {
    private TextView tv_tb_title;


    ImageLoader imageLoader;

    Main_Adapter main_adapter;
    List<Food> foods;
    GridView gv_tuijian;

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
        tv_tb_title.setText("GridViewDemo");
        gv_tuijian = (GridView) findViewById(R.id.main_gv_tuijian);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        //设置listview
        foods = new ArrayList<Food>();
        main_adapter = new Main_Adapter(this, foods);
        gv_tuijian.setAdapter(main_adapter);

        //显示图片
        imageLoader = ImageLoaderFactory.create(this);
//        iv_img.loadImage(imageLoader, "http://pic4.nipic.com/20091201/1496589_125444082374_2.jpg");

        getFoodInfo();


    }

    //查找菜谱信息
    private void getFoodInfo() {
        RequestParams params = new RequestParams();
        params.add("cid", "3");
        params.add("format","1");
        HttpUtil.get(Urls.foodIndex, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject jsonObject) {
                try {
                    JSONObject result = jsonObject.getJSONObject("result");
                    JSONArray datas = result.getJSONArray("data");
                    for (int i = 0; i < datas.length(); i++) {
                        JSONObject data = datas.getJSONObject(i);
                        Food food = new Food();
                        food.setId(data.getString("id"));
                        food.setTitle(data.getString("title"));
                        food.setAlbums(data.getJSONArray("albums").getString(0));
                        foods.add(food);
                    }
                    main_adapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * 初始化时间
     */
    private void initEvent() {
        tv_tb_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("title");
                getFoodInfo();
            }
        });
    }

}
