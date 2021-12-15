package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTariJaipong extends AppCompatActivity {
    Button btnJaipong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_jaipong);
        btnJaipong=(Button) findViewById(R.id.btn_jp1);
        btnJaipong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbtnJaipong =new Intent(ActivityTariJaipong.this,ActivityJaipong1.class);
                startActivity(pindahbtnJaipong);
            }
        });
    }
}