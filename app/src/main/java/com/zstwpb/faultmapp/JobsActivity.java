package com.zstwpb.faultmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class JobsActivity extends AppCompatActivity {


    static ArrayList<String> carL = new ArrayList<String>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        if(getIntent().getExtras() != null){
            String errors = getIntent().getExtras().getString("value");
            if(errors != null){
                carL.add(errors);
            }}
        ListView listView = findViewById(R.id.jobs_list_view);




        //carL.addAll( Arrays.asList(cars) );

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carL);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(JobsActivity.this, AlarmActivity.class);
                intent.putExtra("value2", carL.get(position));
                carL.remove(position);
                adapter.notifyDataSetChanged();
                startActivity(intent);

            }
        });
    }
}
