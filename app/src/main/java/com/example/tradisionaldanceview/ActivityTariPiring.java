package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTariPiring extends AppCompatActivity {
    Button btnPiring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_piring);
        btnPiring=(Button) findViewById(R.id.btn_pr1);

        btnPiring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnPiring=new Intent(ActivityTariPiring.this,ActivityPiring1.class);
                startActivity(pindahbtnPiring);
            }
        });
    }
}