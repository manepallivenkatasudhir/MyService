package com.example.manep.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.btn_start);
        stop = findViewById(R.id.btn_stop);
        start.setOnClickListener(MainActivity.this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.btn_stop:
                stopService(new Intent(this, MyService.class));
        }

    }
}
