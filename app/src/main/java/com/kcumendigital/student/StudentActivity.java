package com.kcumendigital.student;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

<<<<<<< HEAD
import com.kcumendigital.student.fragments.GestionEstudiantes;
=======

import com.google.android.gms.analytics.GoogleAnalytics;
>>>>>>> 3ba169797b1e8021a8ce6787491db845595db581

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

<<<<<<< HEAD

=======
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
>>>>>>> 3ba169797b1e8021a8ce6787491db845595db581
}
