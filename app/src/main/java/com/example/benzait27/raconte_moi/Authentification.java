package com.example.benzait27.raconte_moi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Authentification extends AppCompatActivity implements View.OnClickListener {

    EditText etNomUtilisateur, etMotDePasse;
    Button bAuthentification;
    TextView tvInscriptionLink, tvOubliInfoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        etNomUtilisateur = (EditText)findViewById(R.id.etNomUtilisateur);
        etMotDePasse = (EditText)findViewById(R.id.etMotDePasse);
        bAuthentification = (Button)findViewById(R.id.bAuthentification);
        tvInscriptionLink = (TextView)findViewById(R.id.tvInscriptionLink);
        tvOubliInfoLink = (TextView)findViewById(R.id.tvOubliInfoLink);

        bAuthentification.setOnClickListener(this);
        tvInscriptionLink.setOnClickListener(this);
        tvOubliInfoLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bAuthentification:

                break;

            case R.id.tvInscriptionLink:
                //Refresh
                startActivity(new Intent(this, Inscription.class));
                break;
            
            /* info à traiter
            case R.id.tvOubliInfoLink:
                break;
                */
        }
    }
}
