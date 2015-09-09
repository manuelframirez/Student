package com.kcumendigital.student;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.kcumendigital.student.Util.GestionEstudiantesI;
import com.kcumendigital.student.fragments.CursosFragment;
import com.kcumendigital.student.fragments.GestionEstudiantes;


public class StudentActivity extends AppCompatActivity implements GestionEstudiantesI {

    GestionEstudiantes student;
    CursosFragment cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        student = new GestionEstudiantes();

        cursos = new CursosFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // inicia la transacción
        ft.replace(R.id.container, student);
        ft.commit();
        setContentView(R.layout.activity_student);

    }

    @Override
    protected void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(this).reportActivityStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        GoogleAnalytics.getInstance(this).reportActivityStop(this);
    }

    @Override
    public void onButtonSelected(int button) {
        if (button ==1){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container,cursos);
            ft.commit();
        }

        if (button ==2){


        }
    }
}
