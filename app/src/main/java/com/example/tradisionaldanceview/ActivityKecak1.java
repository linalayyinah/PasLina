package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKecak1 extends AppCompatActivity {
    Button btnBackKecak1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecak1);
        btnBackKecak1=(Button) findViewById(R.id.btn_kc);

        btnBackKecak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnKecak1 = new Intent(ActivityKecak1.this,MainActivity.class);
                startActivity(pindahbtnKecak1);
            }
        });
    }
}