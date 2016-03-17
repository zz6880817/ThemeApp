package com.example.interfaces;

import android.view.View;

import com.example.administrator.mvpdemo.IBean;

import java.util.List;

/**
 * Created by Administrator on 2016/3/15.
 */
public interface IWifiView {
    public void setListViewData(List<IBean> datas);
    public void changeListViewData(List<IBean> datas);
    public void showMsg(View view);
}
