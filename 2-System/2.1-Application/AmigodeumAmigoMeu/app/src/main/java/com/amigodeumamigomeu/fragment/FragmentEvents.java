package com.amigodeumamigomeu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amigodeumamigomeu.R;

/**
 * Created by angus on 21/02/17.
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

        return rootView;
    }
}
