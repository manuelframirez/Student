package com.kcumendigital.student.fragments;


import android.app.Activity;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kcumendigital.student.R;
import com.kcumendigital.student.Util.GestionEstudiantesI;


/**
 * A simple {@link Fragment} subclass.
 */
public class GestionEstudiantes extends Fragment implements View.OnClickListener {

    Button btn_cursos, btn_materias, btn_horarios, btn_examenes;
    GestionEstudiantesI gestionEstudiantesI;

    public GestionEstudiantes() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View v = inflater.inflate(R.layout.fragment_gestion_estudiantes, container, false);

        btn_cursos = (Button) v.findViewById(R.id.cursos);
        btn_examenes = (Button) v.findViewById(R.id.examenes);
        btn_materias = (Button) v.findViewById(R.id.materias);
        btn_horarios = (Button) v.findViewById(R.id.horarios);

        btn_cursos.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cursos:
                gestionEstudiantesI.onButtonSelected(1);
            break;
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        gestionEstudiantesI = (GestionEstudiantesI) activity;
    }
}
