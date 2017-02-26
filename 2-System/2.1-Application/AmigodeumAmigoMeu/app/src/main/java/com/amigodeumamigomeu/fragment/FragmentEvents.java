package com.amigodeumamigomeu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.adapter.CustomEventAdapter;
import com.amigodeumamigomeu.entities.Event;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class FragmentEvents extends Fragment {

    public FragmentEvents() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);
        setRetainInstance(true);
        populateUsersList(rootView);
        return rootView;
    }

    private void populateUsersList(View rootView) {
        // Construct the data source
        ArrayList<Event> arrayOfUsers = Event.getGroups();
        // Create the adapter to convert the array to views
        CustomEventAdapter adapter = new CustomEventAdapter(getActivity(), arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) rootView.findViewById (R.id.lvEvents);
        listView.setAdapter(adapter);
    }
}