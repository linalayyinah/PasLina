package com.example.tradisionaldanceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgTariSaman,imgTariJaipong,imgTariPiring,imgTariKecak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgTariSaman = (CircleImageView) findViewById(R.id.saman);
        imgTariJaipong = (CircleImageView) findViewById(R.id.jaipong);
        imgTariPiring = (CircleImageView) findViewById(R.id.piring);
        imgTariKecak = (CircleImageView) findViewById(R.id.kecak);

        imgTariSaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTariSaman = new Intent(MainActivity.this, ActivityTariSaman.class);
                startActivity(pindahTariSaman);
            }
        });
        imgTariJaipong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTariJaipong = new Intent(MainActivity.this, ActivityTariJaipong.class);
                startActivity(pindahTariJaipong);
            }
        });
        imgTariPiring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTariPiring = new Intent(MainActivity.this, ActivityTariPiring.class);
                startActivity(pindahTariPiring);
            }
        });
        imgTariKecak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTariKecak=new Intent(MainActivity.this,ActivityTariKecak.class);
                startActivity(pindahTariKecak);
            }
        });

    }
}