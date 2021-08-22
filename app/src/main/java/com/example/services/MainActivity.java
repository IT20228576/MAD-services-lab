package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = (Button) this.findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                startService(new Intent(MainActivity.this, MyServices.class));
            }
        });

        Button btn_stop = (Button) this.findViewById(R.id.btn_stop);

        btn_stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                stopService(new Intent(MainActivity.this, MyServices.class));
            }
        });
    }
}