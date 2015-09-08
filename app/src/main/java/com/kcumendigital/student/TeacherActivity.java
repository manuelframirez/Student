package com.kcumendigital.student;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kcumendigital.student.fragments.GestionDocente;

public class TeacherActivity extends AppCompatActivity {

    GestionDocente docente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        docente = new GestionDocente();
        FragmentTransaction ftr = getSupportFragmentManager().beginTransaction();
        ftr.replace(R.id.container_docente,docente);
        ftr.commit();
        setContentView(R.layout.activity_teacher);
    }
}
