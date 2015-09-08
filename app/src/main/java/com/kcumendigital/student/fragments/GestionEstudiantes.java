package com.kcumendigital.student.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kcumendigital.student.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GestionEstudiantes extends Fragment {


    public GestionEstudiantes() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gestion_estudiantes, container, false);
    }


}
