package com.example.benzait27.raconte_moi;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button bDeconnecter;
    EditText etNom, etNbreEnfant, etNomUtilisateur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNom = (EditText)findViewById(R.id.etNom);
        etNbreEnfant = (EditText)findViewById(R.id.etNbreEnfant);
        etNomUtilisateur = (EditText)findViewById(R.id.etNomUtilisateur);
        bDeconnecter = (Button)findViewById(R.id.bDeconnecter);

        bDeconnecter.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bDeconnecter:
                //startActivity(new Intent(this, Authentification.class));
                break;
        }
    }
}
