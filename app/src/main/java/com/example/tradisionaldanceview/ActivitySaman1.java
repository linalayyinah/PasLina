package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySaman1 extends AppCompatActivity {
    Button btnBackSaman1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saman1);
        btnBackSaman1=(Button) findViewById(R.id.btn_sm);

        btnBackSaman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnSaman1=new Intent(ActivitySaman1.this,MainActivity.class);
                startActivity(pindahbtnSaman1);
            }
        });
    }
}