package com.zstwpb.faultmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {

    static ArrayList<String> carL = new ArrayList<String>();
    Date today = Calendar.getInstance().getTime();
    String pattern = "yyyy-MM-dd-hh.mm.ss";
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    String finishTime = formatter.format(today);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        if(getIntent().getExtras() != null){
            String errors = "Finish time: " + finishTime + "\n" + getIntent().getExtras().getString("value2");
            if(errors != null){
                carL.add(errors);
            }}
        ListView listView = findViewById(R.id.alarms_list_view);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carL);

        listView.setAdapter(adapter);
    }

}
