package com.example.administrator.mvpdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/15.
 */
public class WifiAdapter extends BaseAdapter{
    private List<IBean> datas;
    private LayoutInflater inflater;
    public WifiAdapter(Context context){
        inflater = LayoutInflater.from(context);
        datas = new ArrayList<IBean>();
    }

    public void setDatas(List<IBean> datas){
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }
    public void changeDatas(List<IBean> datas){
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.lv_item,parent,false);
        TextView tv = (TextView) convertView.findViewById(R.id.name);
        tv.setText(datas.get(position).getName());
        return convertView;
    }
}
