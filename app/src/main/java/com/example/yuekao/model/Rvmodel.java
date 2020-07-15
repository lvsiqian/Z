package com.example.yuekao.model;

import com.example.yuekao.Bean;
import com.example.yuekao.ResultCallback;
import com.example.yuekao.net.ApiService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Rvmodel {
    public void getdtata(ResultCallback<Bean> beanResultCallback) {
        new Retrofit.Builder()
                .baseUrl(ApiService.Basurl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class)
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new ResourceSubscriber<Bean>() {
                    @Override
                    public void onNext(Bean bean) {
                        beanResultCallback.onsuccess(bean);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
