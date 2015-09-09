package com.kcumendigital.student;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.kcumendigital.student.fragments.CursosFragment;

public class NoteActivity extends AppCompatActivity {

    CursosFragment cursosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        ((AnalyticsAplication) getApplication()).getTracker(AnalyticsAplication.TrackerName.APP_TRACKER);

        cursosFragment = new CursosFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container_notas, cursosFragment);
        ft.commit();

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
}
