package com.example.administrator.mvpdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.interfaces.IWifiPresent;
import com.example.interfaces.IWifiView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IWifiView{
    private ListView lv;
    private WifiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv);
        lv = (ListView)findViewById(R.id.lv);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_show);
        FloatingActionButton fab_add = (FloatingActionButton) findViewById(R.id.fab_del);

        final WifiPresentImpl present = new WifiPresentImpl(this);
        present.create();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present.showSnaker(view);
            }
        });
        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 present.addBean(new IBean("添加的",22));
            }
        });
    }

    @Override
    public void setListViewData(List<IBean> datas) {
        adapter = new WifiAdapter(getApplicationContext());
        adapter.setDatas(datas);
        lv.setAdapter(adapter);
    }

    @Override
    public void changeListViewData(List<IBean> datas) {
         adapter.changeDatas(datas);
    }

    @Override
    public void showMsg(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
