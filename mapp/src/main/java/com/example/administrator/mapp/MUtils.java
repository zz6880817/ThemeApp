package com.example.administrator.mapp;

import android.app.Activity;
import android.view.WindowManager;

/**
 * Created by Administrator on 2016/3/16.
 */
public class MUtils {
    /**
     * 设置当前Activity沉浸栏
     * */
    public static void setStatusBarContext(Activity activity){
        //透明状态栏
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }
}
