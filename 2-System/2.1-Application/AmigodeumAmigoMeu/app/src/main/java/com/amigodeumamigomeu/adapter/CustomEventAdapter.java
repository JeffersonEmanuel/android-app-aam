package com.amigodeumamigomeu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.entities.Event;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class CustomEventAdapter extends ArrayAdapter<Event> {

    public CustomEventAdapter(Context context, ArrayList<Event> group) {
        super(context, 0, group);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Event group = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            if (group.getQtPessoas() == 1){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_event_one, parent, false);
            } else if (group.getQtPessoas() == 2){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_event_two, parent, false);
            }else if (group.getQtPessoas() == 3){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_event_three, parent, false);
            } else{
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_event_four, parent, false);
            }

        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvTitle);

        // Populate the data into the template view using the data object
        tvName.setText(group.getTitle());
        // Return the completed view to render on screen
        return convertView;
    }
}