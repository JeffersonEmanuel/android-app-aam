package com.amigodeumamigomeu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by angus on 21/02/17.
 */

public class FragmentNotifications extends Fragment {

    public FragmentNotifications() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
        setRetainInstance(true);

        return rootView;
    }
}
