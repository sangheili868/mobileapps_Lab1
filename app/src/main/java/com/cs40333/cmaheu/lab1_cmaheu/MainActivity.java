package com.cs40333.cmaheu.lab1_cmaheu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String[]> teams = new ArrayList<String[]>();
        teams.add(new String[] {"@mipmap/florida_state","Florida State","Feb 11"});
        teams.add(new String[] {"@mipmap/bc","Boston College","Feb 14"});
        teams.add(new String[] {"@mipmap/ncs","North Carolina State","Feb 18"});
        teams.add(new String[] {"@mipmap/georgia_tech_yellow_jackets","Georgia Tech","Feb 26"});
        teams.add(new String[] {"@mipmap/bc","Boston College","March 1"});
        teams.add(new String[] {"@mipmap/louisville","Louisville","March 4"});
        teams.add(new String[] {"@mipmap/acc","ACC Tournament","March 7"});
        teams.add(new String[] {"@mipmap/ncaa","NCAA Tournament","March 16"});
        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(this, teams);

        ListView scheduleListView = (ListView) findViewById(R.id.scheduleListView);
        scheduleListView.setAdapter(scheduleAdapter);


    }
}
