package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTariKecak extends AppCompatActivity {
    Button btnKecak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_kecak);
        btnKecak=(Button) findViewById(R.id.btn_kc1);

        btnKecak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnKecak=new Intent(ActivityTariKecak.this,ActivityKecak1.class);
                startActivity(pindahbtnKecak);
            }
        });
    }
}