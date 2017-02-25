package com.amigodeumamigomeu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.adapter.CustomFeedAdapter;
import com.amigodeumamigomeu.adapter.CustomGroupAdapter;
import com.amigodeumamigomeu.entities.Feed;
import com.amigodeumamigomeu.entities.Group;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class FragmentGroup extends Fragment {

    public FragmentGroup() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_group, container, false);
        setRetainInstance(true);
        populateUsersList(rootView);
        return rootView;
    }

    private void populateUsersList(View rootView) {
        // Construct the data source
        ArrayList<Group> arrayOfUsers = Group.getGroups();
        // Create the adapter to convert the array to views
        CustomGroupAdapter adapter = new CustomGroupAdapter (getActivity(), arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) rootView.findViewById (R.id.lvGroup);
        listView.setAdapter(adapter);
    }
}