package com.amigodeumamigomeu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.entities.Friend;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class CustomFriendAdapter extends ArrayAdapter<Friend> {

    public CustomFriendAdapter(Context context, ArrayList<Friend> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Friend friend = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_friend, parent, false);
        }
        // Lookup view for data population
        TextView tvCity = (TextView) convertView.findViewById(R.id.tvCity);
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);

        // Populate the data into the template view using the data object
        tvName.setText(friend.getName());
        tvCity.setText(friend.getCity());
        // Return the completed view to render on screen
        return convertView;
    }



}
