package com.example.benzait27.raconte_moi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = (Button) findViewById(R.id.ok);

       // Button ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText user = (EditText) findViewById(R.id.user);
                EditText psw = (EditText) findViewById(R.id.psw);
                if (user.getText().equals("zaki")&& psw.getText().equals("zaki") )
                {
                    Toast.makeText(getApplicationContext(), "successful authentication",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "failure authentication",Toast.LENGTH_SHORT).show();
                }
                // Do what you want here...
            }
        });

    }
}
