package com.example.chen.myapplication;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by chen on 2017/10/7.
 */

public class MyLeanCloudApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"b5th4IkHplV5LynPkndSa82x-gzGzoHsz","YmnEOksb4qID5iBFajjJ3ybG");
    }
}
