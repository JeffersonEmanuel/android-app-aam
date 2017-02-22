package com.amigodeumamigomeu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.ListView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.adapter.CustomFeedAdapter;
import com.amigodeumamigomeu.entities.Feed;

import java.util.ArrayList;

/**
 * Created by angus on 21/02/17.
 */

public class FragmentFeed extends Fragment {
    public FragmentFeed() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_feed, container, false);
        setRetainInstance(true);
        populateUsersList(rootView);
        return rootView;
    }



    private void populateUsersList(View rootView) {
        // Construct the data source
        ArrayList<Feed> arrayOfUsers = Feed.getUsers();
        // Create the adapter to convert the array to views
        CustomFeedAdapter adapter = new CustomFeedAdapter (getActivity(), arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) rootView.findViewById (R.id.lvFeeds);
        listView.setAdapter(adapter);
    }



}
