package com.example.benzait27.raconte_moi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Inscription extends AppCompatActivity {

    Button bSoumettre;
    EditText nomUtilisateur, motDePasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        nomUtilisateur = (EditText)findViewById(R.id.nomUtilisateur);
        motDePasse = (EditText)findViewById(R.id.motDePasse);
        bSoumettre = (Button)findViewById(R.id.bSoumettre);
    }
}
