package com.ctbarbanza.gupyou.screens;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ctbarbanza.gupyou.R;


public class SearchFragment extends Fragment {

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_search, container, false);
        initButtons(view);
        return view;
    }

    private void initButtons(View view) {

    }

}
