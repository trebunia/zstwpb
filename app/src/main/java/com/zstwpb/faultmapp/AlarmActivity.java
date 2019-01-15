package com.zstwpb.faultmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlarmActivity extends AppCompatActivity {

    static ArrayList<String> carL = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        if(getIntent().getExtras() != null){
            String errors = getIntent().getExtras().getString("value2");
            if(errors != null){
                carL.add(errors);
            }}
        ListView listView = findViewById(R.id.alarms_list_view);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carL);

        listView.setAdapter(adapter);
    }

}
