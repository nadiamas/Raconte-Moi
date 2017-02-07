package com.example.benzait27.raconte_moi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText ettNomUtilisateur, etMotDePasse;
    Button bConncexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettNomUtilisateur = (EditText)findViewById(R.id.etNomUtilisateur);
        etMotDePasse = (EditText)findViewById(R.id.etMotDePasse);
        bConncexion = (Button)findViewById(R.id.bConnexion);

        bConncexion.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bConnexion:
                startActivity(new Intent(this, Authentification.class));
                break;
        }
    }
}
