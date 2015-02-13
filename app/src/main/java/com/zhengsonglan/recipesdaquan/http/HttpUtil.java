package com.zhengsonglan.recipesdaquan.http;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.zhengsonglan.recipesdaquan.config.Config;

/**
 * Created by zsl on 2015/2/12.
 * 网络请求的工具类
 */
public class HttpUtil {


    private static AsyncHttpClient client = new AsyncHttpClient();

    //get请求
    public static void get(String url, RequestParams params, JsonHttpResponseHandler jsonHttpResponseHandler) {
        client.get(url, getAbsoluteRequestParams(params), jsonHttpResponseHandler);
    }

    //post请求
    public static void post(String url, RequestParams params, JsonHttpResponseHandler jsonHttpResponseHandler) {
        client.post(url, getAbsoluteRequestParams(params), jsonHttpResponseHandler);
    }

    //最终的参数
    private static RequestParams getAbsoluteRequestParams(RequestParams requestParams) {
        requestParams.add("key", Config.JuHe_AppKey);
        return requestParams;
    }

}
