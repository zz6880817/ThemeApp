package com.example.administrator.mvpdemo;

import android.view.View;

import com.example.interfaces.IWifiModel;
import com.example.interfaces.IWifiPresent;
import com.example.interfaces.IWifiView;

/**
 * Created by Administrator on 2016/3/15.
 */
public class WifiPresentImpl implements IWifiPresent{
    private IWifiView mIWifiView;
    private IWifiModel mIWifiModel;

    public WifiPresentImpl(IWifiView iWifiView){
          this.mIWifiView = iWifiView;
          mIWifiModel = new IWifiModelImpl();
    }

    @Override
    public void create() {
        setWifiDatas();
    }
    //Activity启动要做的事
    private void setWifiDatas() {
        mIWifiView.setListViewData(mIWifiModel.getWifiDatas());
    }

    public void showSnaker(View view){
        mIWifiView.showMsg(view);
    }

    public void addBean(IBean bean){
        mIWifiView.setListViewData(mIWifiModel.addWifi(bean));
    }
}
