package com.example.administrator.mvpdemo;

import com.example.interfaces.IWifiModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/15.
 */
public class IWifiModelImpl implements IWifiModel{
    List<IBean> list;
    @Override
    public List<IBean> getWifiDatas() {
        list = new ArrayList<IBean>();
        for (int i=0;i<10;i++){
             IBean bean = new IBean("wifi"+i,i);
             list.add(bean);
        }
        return list;
    }

    @Override
     public List<IBean> addWifi(IBean bean) {
            if(list != null){
                list.add(bean);
            }
            return list;

    }

    @Override
    public void delWifi(IBean bean) {

    }
}
