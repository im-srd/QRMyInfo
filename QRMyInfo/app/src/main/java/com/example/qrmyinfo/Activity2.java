package com.example.qrmyinfo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Activity2 extends AppCompatActivity {
    private Button generateQRbtn,scanQRbtn;
    ImageButton imageButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        generateQRbtn = findViewById(R.id.gqr);
        scanQRbtn = findViewById(R.id.sqr);
        generateQRbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, GenerateQRcode.class);
                startActivity(i);
            }
        });

        scanQRbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, ScanQRCode.class);
                startActivity(i);
            }
        });

        imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this , MainActivity.class);
                startActivity(intent);
                // Animation Styles
                Animatoo.animateSlideDown(Activity2.this);
            }
        });
    }
}