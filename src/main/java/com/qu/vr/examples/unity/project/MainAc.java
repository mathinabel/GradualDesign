package com.qu.vr.examples.unity.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.R;
import com.qu.vr.examples.unity.project.fangdouyin.FangDouYinAc;
import com.qu.vr.examples.unity.project.fangdouyinnet.FangDouYinNetAc;
import com.quyuanjin.vr.unity.project.UnityPlayerActivity;

public class MainAc extends AppCompatActivity {
    private Button fangdouyin;
    private Button fangdouyinnet;

    private Button vrlocal;
    private Button vrVideo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
        initView();
    }

    private void initView() {
        fangdouyin = findViewById(R.id.fangdouyin);
        fangdouyin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAc.this, FangDouYinAc.class);
                startActivity(intent);
            }
        });

        fangdouyinnet = findViewById(R.id.fangdouyinnet);
        fangdouyinnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAc.this, FangDouYinNetAc.class);
                startActivity(intent);
            }
        });
        vrlocal = findViewById(R.id.vrlocal);
        vrlocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAc.this, UnityPlayerActivity.class);
                startActivity(intent);
                finish();
            }
        });


        vrVideo = findViewById(R.id.vr_video);
        vrVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainAc.this,"待完善",Toast.LENGTH_SHORT).show();
              //  Intent intent = new Intent(MainAc.this, VRVideoAc.class);
            //    startActivity(intent);
           //     finish();
            }
        });
    }


}
