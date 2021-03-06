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

public class NetworkStatusActivity extends AppCompatActivity {
    static String cars[] = {"Broken link between: s1 and s2. \nOccurence Time: 21:21:33  Date: 14.01.2019 \nLocation: 50.078761, 19.886883", "Broken link between: s3 and s4. \nOccurence time: 12:11:43  Date: 14.01.2019 \nLocation: 50.071834, 19.924990", "Broken link between: s5 and s6.\nOccurence time: 16:21:18  Date: 14.01.2019 \nLocation: 50.049319, 19.931664"};
    static ArrayList<String> carL = new ArrayList<String>(Arrays.asList(cars));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_status);
        ListView listView = findViewById(R.id.networking_list_view);




        //carL.addAll( Arrays.asList(cars) );

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carL);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                 Intent intent = new Intent(NetworkStatusActivity.this, JobsActivity.class);
                 intent.putExtra("value", carL.get(position));
                 carL.remove(position);
                 adapter.notifyDataSetChanged();
                 startActivity(intent);

            }
        });
    }
}
