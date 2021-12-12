package com.example.foodisgr8.Vista;


import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodisgr8.R;

public class Fragment_Favoritos extends Fragment {

    View v;
    ActionBar actionBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__favoritos, container, false);
//------------------------------------------------------------------------------------------
        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Favoritos");
//------------------------------------------------------------------------------------------
        return v;
    }
}