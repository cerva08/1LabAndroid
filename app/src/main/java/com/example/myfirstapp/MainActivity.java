package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button cat;
    private Button dog;
    private Button cow;
    boolean click = true;
    boolean click2 = true;
    boolean click3 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = findViewById(R.id.cat);
        final MediaPlayer mediaCat = MediaPlayer.create(this,R.raw.cat);

        cat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaCat.start();
                if (click){
                    cat.setBackgroundColor(Color.parseColor("#34D02A"));
                    click = false;
                } else{
                    cat.setBackgroundColor(Color.parseColor("#6109B4"));
                    click = true;
                }

            }
        });

        cow = findViewById(R.id.cow);
        final MediaPlayer mediaCow = MediaPlayer.create(this,R.raw.cow);

        cow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaCow.start();
                if (click2){
                    cow.setBackgroundColor(Color.parseColor("#2526D8"));
                    click2 = false;
                } else{
                    cow.setBackgroundColor(Color.parseColor("#6109B4"));
                    click2 = true;
                }
            }
        });

        dog = findViewById(R.id.dog);
        final MediaPlayer mediaDog = MediaPlayer.create(this,R.raw.dog);

        dog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaDog.start();
                if (click3){
                    dog.setBackgroundColor(Color.parseColor("#FF5733"));
                    click3 = false;
                } else{
                    dog.setBackgroundColor(Color.parseColor("#6109B4"));
                    click3 = true;
                }
            }
        });



    }
}

