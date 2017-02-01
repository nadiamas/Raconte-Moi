package com.example.benzait27.raconte_moi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inscription extends AppCompatActivity implements View.OnClickListener {

    Button bEnregister;
    EditText etNom, etNbreEnfant, etNomUtilisateur, etMotDePasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        etNom = (EditText)findViewById(R.id.etNom);
        etNbreEnfant = (EditText)findViewById(R.id.etNbreEnfant);
        etNomUtilisateur = (EditText)findViewById(R.id.etNomUtilisateur);
        etMotDePasse = (EditText)findViewById(R.id.etMotDePasse);
        bEnregister = (Button)findViewById(R.id.bEnregistre);

        bEnregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bEnregistre:

                break;
        }
    }
}
