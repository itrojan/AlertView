package com.aihook.alertview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aihook.alertview.library.AlertView;
import com.aihook.alertview.library.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertView("标题", "内容", "取消", null, new String[]{"xx", "22"}, mContext, AlertView.Style.ActionSheet, new OnItemClickListener() {
                    @Override
                    public void onItemClick(Object o, int position) {

                    }
                }, AlertView.Orientation.Vertical).setCancelable(true).show();
            }
        });


    }
}
