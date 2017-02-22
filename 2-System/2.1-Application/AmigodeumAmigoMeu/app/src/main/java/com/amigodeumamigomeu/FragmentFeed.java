package com.amigodeumamigomeu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

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

        return rootView;
    }



}
