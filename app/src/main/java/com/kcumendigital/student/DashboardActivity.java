package com.kcumendigital.student;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView est, doc, not, foro;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        est = (ImageView) findViewById(R.id.estudiantes);
        doc = (ImageView) findViewById(R.id.docentes);
        not = (ImageView) findViewById(R.id.notas);
        foro = (ImageView) findViewById(R.id.foros);

        est.setOnClickListener(this);
        doc.setOnClickListener(this);
        not.setOnClickListener(this);
        foro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.estudiantes:
                Intent intes = new Intent(this,StudentActivity.class);
                startActivity(intes);
                break;

            case R.id.docentes:
                Intent intdoc = new Intent(this,TeacherActivity.class);
                startActivity(intdoc);
                break;

            case R.id.notas:
                Intent intnota = new Intent(this,NoteActivity.class);
                startActivity(intnota);
                break;

            case R.id.foros:
                Intent intforo = new Intent(this,ForosActivity.class);
                startActivity(intforo);
                break;
        }

    }
}
