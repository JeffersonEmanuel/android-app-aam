package com.amigodeumamigomeu.adapter;

import com.amigodeumamigomeu.entities.Feed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.amigodeumamigomeu.R;
import java.util.ArrayList;

/**
 * Created by angus on 21/02/17.
 */

public class CustomFeedAdapter extends ArrayAdapter<Feed> {

    public CustomFeedAdapter(Context context, ArrayList<Feed> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Feed user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_feed, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);

        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        // Return the completed view to render on screen
        return convertView;
    }
}