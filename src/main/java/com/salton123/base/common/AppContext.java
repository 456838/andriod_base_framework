package com.salton123.base.common;

import android.app.Application;

import org.xutils.x;


public class AppContext extends Application {

    private static AppContext app;

    public AppContext() {
        app = this;
    }

    public static synchronized AppContext getInstance() {
        if (app == null) {
            app = new AppContext();
        }
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
      //  LeakCanary.install(this);
      //  registerUncaughtExceptionHandler();
        InitXutils();
    }

    /**
     * 初始化Xutils框架
     */
    private void InitXutils() {
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
    }
    // 注册App异常崩溃处理器
    private void registerUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(AppException.getAppExceptionHandler());
    }


}