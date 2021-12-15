package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPiring1 extends AppCompatActivity {
    Button btnBackPiring1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piring1);
        btnBackPiring1=(Button) findViewById(R.id.btn_pr);

        btnBackPiring1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnPiring1 =new Intent(ActivityPiring1.this,MainActivity.class);
                startActivity(pindahbtnPiring1);
            }
        });
    }
}