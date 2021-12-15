package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTariSaman extends AppCompatActivity {
    Button btnSaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_saman);
        btnSaman=(Button) findViewById(R.id.btn_sm1);

        btnSaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnSaman=new Intent(ActivityTariSaman.this,ActivitySaman1.class);
                startActivity(pindahbtnSaman);
            }
        });
    }
}