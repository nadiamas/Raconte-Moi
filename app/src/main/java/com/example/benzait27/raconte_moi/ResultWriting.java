package com.example.benzait27.raconte_moi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultWriting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_writing);
        Intent saveIntent = getIntent();
        Bundle bundle = saveIntent.getExtras();

        ImageView image = (ImageView) findViewById(R.id.image);
        TextView text = (TextView) findViewById(R.id.para);

        text.setText(bundle.getString("text"));

        DrawingView view = (DrawingView) bundle.getSerializable("view");
        image.setImageBitmap(view.getDrawingCache());

    }
}
