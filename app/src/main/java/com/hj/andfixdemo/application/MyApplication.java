package com.hj.andfixdemo.application;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by haojian12583 on 2016/9/29.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}
