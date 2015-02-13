package com.zhengsonglan.recipesdaquan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zhengsonglan.recipesdaquan.R;
import com.zhengsonglan.recipesdaquan.adapter.util.ViewHolderUtil;
import com.zhengsonglan.recipesdaquan.entity.Food;

import java.util.List;

import in.srain.cube.image.CubeImageView;
import in.srain.cube.image.ImageLoader;
import in.srain.cube.image.ImageLoaderFactory;

/**
 * Created by zsl on 2015/2/12.
 */
public class Main_Adapter extends BaseAdapter {
    Context context;
    List<Food> foods;
    ImageLoader imageLoader;
    LayoutInflater layoutInflater;

    public Main_Adapter(Context context, List<Food> foods) {
        this.context = context;
        this.foods = foods;
        imageLoader = ImageLoaderFactory.create(context);
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return foods == null ? 0 : foods.size();
    }

    @Override
    public Object getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.main_lv_item, null);
        }
        CubeImageView imageView = ViewHolderUtil.get(convertView, R.id.main_iv_img);
        TextView title = ViewHolderUtil.get(convertView, R.id.main_tv_title);
        Food food = foods.get(position);
        String img_url = food.getAlbums();
        imageView.loadImage(imageLoader, img_url);
        imageView.setTag(img_url);
        title.setText(food.getTitle());
        return convertView;
    }

}
