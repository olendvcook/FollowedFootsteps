package com.example.FollowedFootsteps;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Michael on 4/1/14.
 */
public class RoutesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(com.example.followedfootsteps.R.layout.fragment_routes, container, false);
    }
}