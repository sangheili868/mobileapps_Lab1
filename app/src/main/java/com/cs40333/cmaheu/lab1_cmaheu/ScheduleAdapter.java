package com.cs40333.cmaheu.lab1_cmaheu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chris_000 on 2/9/2017.
 */

public class ScheduleAdapter extends ArrayAdapter<String[]> {
    ScheduleAdapter (Context context, ArrayList<String[]> schedule) {
        super(context, R.layout.schedule_item, schedule);
    }
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater scheduleInflater = LayoutInflater.from(getContext());
        View scheduleView = scheduleInflater.inflate(R.layout.schedule_item, parent, false);

        String[] matchItem = getItem(position);
        TextView teamName = (TextView) scheduleView.findViewById(R.id.scheduleText);
        TextView dateName = (TextView) scheduleView.findViewById(R.id.dateText);
        ImageView teamLogo = (ImageView) scheduleView.findViewById(R.id.teamLogo);
        String mDrawableName = matchItem[0];
        Context mycontext = getContext();
        int resID = mycontext.getResources().getIdentifier(mDrawableName , "drawable", mycontext.getPackageName());
        teamLogo.setImageResource(resID );
        teamName.setText(matchItem[1]);
        dateName.setText(matchItem[2]);
        return scheduleView;
    }
}
