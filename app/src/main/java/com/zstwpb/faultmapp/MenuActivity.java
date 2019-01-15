package com.zstwpb.faultmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button jobs = findViewById(R.id.button5);
        Button network = findViewById(R.id.button2);
        Button alarms = findViewById(R.id.button6);
        jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity((new Intent(MenuActivity.this, JobsActivity.class)));
            }
        });
        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, NetworkStatusActivity.class));
            }
        });
        alarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity((new Intent(MenuActivity.this, AlarmActivity.class)));

            }
        });
    }

}
