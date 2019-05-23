package com.mjdy.searchbarsample;

import android.app.Application;

import com.mjdy.libsearchbar.MJSearchBar;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MJSearchBar.init(this, "123456");  // 初始化
    }
}
