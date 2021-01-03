package com.example.dev.soundboardv4;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Anime_sound extends AppCompatActivity {

    SoundPool animeOST;

    MediaPlayer animeMedia;

    int SouthPark;

    int Worldo;
    int Wry;
    int Clock;
    int Noo;
    int OmaeWa;
    int Shit;
    int Boostu;


    MediaPlayer WeebSound1;
    MediaPlayer WeebSound2;
    MediaPlayer WeebSound3;
    MediaPlayer WeebSound4;
    MediaPlayer WeebSound5;
    MediaPlayer WeebSound6;
    MediaPlayer WeebSound7;
    MediaPlayer WeebSound8;
    MediaPlayer WeebSound9;
    MediaPlayer WeebSound10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_sound);


        animeOST = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);


        Wry = animeOST.load(this, R.raw.wryyy, 1);
        Worldo = animeOST.load(this, R.raw.za_warudo, 1);
        Clock = animeOST.load(this, R.raw.warudo_clock_effect, 1);
        OmaeWa = animeOST.load(this, R.raw.mou_shindeiru, 1);
        Shit = animeOST.load(this, R.raw.oh_shit, 1);
        Noo = animeOST.load(this, R.raw.oh_no, 1);
        Boostu = animeOST.load(this, R.raw.boost, 1);


// Code for the floating button
        FloatingActionButton fabYoutube = (FloatingActionButton) findViewById(R.id.Fab_Youtube);
        fabYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Anime_sound.this, MainMenu.class);
                startActivity(intent);
            }
        });




    }


    public void AnimeSound1(View view) {

        // This will play the "Za Warudo" sound

        animeOST.play(Worldo, 1, 1, 1, 0, 1);

    }


    public void AnimeSound2(View view) {

        // This will play the "Clock Effect" sound

        animeOST.play(Clock, 1, 1, 1, 0, 1);

    }


    public void AnimeSound3(View view) {

        // This will play the "Wrrryyy" sound

        animeOST.play(Wry, 1, 1, 1, 0, 1);
    }

    public void AnimeSound4(View view) {

        //This will play the "Oh Nooo !!!" Sound

        animeOST.play(Noo, 1, 1, 1, 0, 1);
    }

    public void AnimeSound5(View view) {

        // This will play the "Omae wa mo Shinderu" Sound

        animeOST.play(OmaeWa, 1, 1, 1, 0, 1);

    }

    public void AnimeSound6(View view) {

        //This wil play the Oh Shit !!" Sound

        animeOST.play(Shit, 1, 1, 1, 0, 1);
    }

    public void AnimeSound7(View view) {

        // This will play the "Boost !!!" Sound

        animeOST.play(Boostu, 1, 1, 1, 0, 1);

    }
}

