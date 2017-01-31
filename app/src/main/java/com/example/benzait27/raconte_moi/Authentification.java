package com.example.benzait27.raconte_moi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Authentification extends AppCompatActivity implements View.OnClickListener {

    Button bSoumettre;
    EditText nomUtilisateur, motDePasse;
    TextView tvEnregistrerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        nomUtilisateur = (EditText)findViewById(R.id.etNomUtilisateur);
        motDePasse = (EditText)findViewById(R.id.etMotDePasse);
        bSoumettre = (Button)findViewById(R.id.bSoumettre);
        tvEnregistrerLink = (TextView)findViewById(R.id.tvEnregistrerLink);

        bSoumettre.setOnClickListener(this);
        tvEnregistrerLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bSoumettre:

                break;

            case R.id.tvEnregistrerLink:
                //Refresh
                startActivity(new Intent(this, Inscription.class));
                break;
        }
    }
}
