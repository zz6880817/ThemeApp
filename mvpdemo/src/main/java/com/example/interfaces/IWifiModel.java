package com.example.interfaces;

import com.example.administrator.mvpdemo.IBean;

import java.util.List;

/**
 * Created by Administrator on 2016/3/15.
 */
public interface IWifiModel {
    public List<IBean> getWifiDatas();
    public List<IBean> addWifi(IBean bean);
    public void delWifi(IBean bean);
}
