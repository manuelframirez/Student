package com.kcumendigital.student;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kcumendigital.student.fragments.GestionEstudiantes;

public class StudentActivity extends AppCompatActivity {

    GestionEstudiantes student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        student = new GestionEstudiantes();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // inicia la transacción

        ft.replace(R.id.container, student);

        ft.commit();

        setContentView(R.layout.activity_student);
    }


}
