package com.amigodeumamigomeu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.amigodeumamigomeu.R;
import com.amigodeumamigomeu.adapter.CustomFeedAdapter;
import com.amigodeumamigomeu.adapter.CustomFriendAdapter;
import com.amigodeumamigomeu.entities.Feed;
import com.amigodeumamigomeu.entities.Friend;

import java.util.ArrayList;

/**
 * Created by angus on 21/02/17.
 */

public class FragmentFriends extends Fragment {

    public FragmentFriends() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_friends, container, false);
        setRetainInstance(true);
        populateFriendList(rootView);
        return rootView;
    }


    private void populateFriendList(View rootView) {
        // Construct the data source
        ArrayList<Friend> arrayOfUsers = Friend.getFriends();
        // Create the adapter to convert the array to views
        CustomFriendAdapter adapter = new CustomFriendAdapter (getActivity(), arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) rootView.findViewById (R.id.lvFriends);
        listView.setAdapter(adapter);
    }

}
