package com.example.yuekao.net;

import com.example.yuekao.Bean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface ApiService {
    //网址
    String Basurl="http://yun918.cn/";
    @GET("live/xsxb.json")
    //利用Flowable
    Flowable<Bean> getData();
}
