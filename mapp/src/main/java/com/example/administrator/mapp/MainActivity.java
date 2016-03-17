package com.example.administrator.mapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.fourmob.poppyview.PoppyViewHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<String> datas = new ArrayList<String>();
    private PoppyViewHelper mPoppyViewHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPoppyViewHelper = new PoppyViewHelper(this, PoppyViewHelper.PoppyViewPosition.TOP);
        View poppyView = mPoppyViewHelper.createPoppyViewOnListView(R.id.lv,R.layout.borderview);
        poppyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v.findViewById(R.id.btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"AA",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        lv = (ListView) findViewById(R.id.lv);
        initDatas();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,datas);
        lv.setAdapter(adapter);
    }

    private void initDatas() {
        for (int i = 0 ;i<200;i++){
            datas.add("xiangmu"+i);
        }
    }
}
