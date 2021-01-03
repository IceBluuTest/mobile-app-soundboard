package com.example.dev.soundboardv4;

import android.app.ActionBar;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.BottomNavigationView;


import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    SoundPool mySound;
    SoundPool myNewSound;

    MediaPlayer NewMedia;

    int LikeYah;
    int EasywayOrHardway;
    int Hard;
    int Reead;
    int Powerful;
    int Warrior;
    int TakingTime;
    int Yeah;
    int Kicked;
    int Eat;
    int Express;
    int Aboard;


    MediaPlayer Rmysound1;
    MediaPlayer Rmysound2;
    MediaPlayer Rmysound3;
    MediaPlayer Rmysound4;
    MediaPlayer Rmysound5;
    MediaPlayer Rmysound6;
    MediaPlayer RmySound7;
    MediaPlayer RmySound8;
    MediaPlayer RmySound9;
    MediaPlayer RmySound10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is for the Soundboards remove the relevant audio files
        //Excluding the 1st line (mySound) part

        mySound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        myNewSound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        //Needs to sort out the media player code in order to play a longer audio



        LikeYah = mySound.load(this, R.raw.like_ya, 1);
        EasywayOrHardway = mySound.load(this, R.raw.ways, 1);
        Hard = mySound.load(this, R.raw.hard_way, 1);
        Reead = mySound.load(this, R.raw.read_niggah, 1);
        Powerful = mySound.load(this, R.raw.powerfull_niggadry, 1);
        Warrior = mySound.load(this, R.raw.im_a_warrior, 1);
        TakingTime = mySound.load(this, R.raw.take_your_time,1);
        Yeah = mySound.load(this, R.raw.oh_yeah,1);
        Eat = mySound.load(this, R.raw.eat_a_dick_nugga,1);
        Kicked = mySound.load(this, R.raw.kicked_in_your_chest, 1);
        Express = mySound.load(this, R.raw.ass_whopping_xpress, 1);
        Aboard= mySound.load(this, R.raw.all_aboard,1);


      /*  Rmysound1 = MediaPlayer.create(this, R.raw.like_ya);
        Rmysound2 = MediaPlayer.create(this, R.raw.ways);
        Rmysound3 = MediaPlayer.create(this, R.raw.hard_way);
        Rmysound4 = MediaPlayer.create(this, R.raw.read_niggah);
        Rmysound5 = MediaPlayer.create(this, R.raw.powerfull_niggadry);
        Rmysound6 = MediaPlayer.create(this, R.raw.im_a_warrior);
        RmySound7 = MediaPlayer.create(this, R.raw.kicked_in_your_chest);
        RmySound8 = MediaPlayer.create(this, R.raw.ass_whopping_xpress); */




        // Code for the floating button
      FloatingActionButton fabBoondocks = (FloatingActionButton) findViewById(R.id.Fab_Boondocks);
        fabBoondocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });

    }

    public void mySound1 (View view )  {
        // This will play the "I Like Ya" Sound


        mySound.play(LikeYah, 1, 1, 1, 0, 1);


    }


    public void mySound2(View view) {
        // This will play the "Easy way or Hard way " Sound

        mySound.play(EasywayOrHardway, 1, 1, 1, 0, 1);


    }


    public void mySound3(View view) {
        // This will play the "You Chose the Hard way" Sound

        mySound.play(Hard, 1, 1, 1, 0, 1);

    }

    public void mySound4(View view) {
        // This will play the "Read Nigga" Sound

        mySound.play(Reead, 1, 1, 1, 0, 1);

    }


    public void mySound5(View view) {
        // This will play the "Powerful Niggadry" Sound

        mySound.play(Powerful, 1, 1, 1, 0, 1);

    }


    public void mySound6(View view) {
        // This will play the "I am Warrior" Sound

        mySound.play(Warrior, 1, 1, 1, 0, 1);

    }

    public void mySound7(View view) {
        // This will play the " Hmmhmm Take Your Time" Sound

        mySound.play(TakingTime, 1, 1, 1, 0, 1);


    }


    public void mySound8(View view) {

        // This will play the "Oh Yeah !!!" Sound

        mySound.play(Yeah, 1, 1, 1, 0, 1);

    }

    public void mySound9(View view) {

        // This will play the "Kicked in your Chest" Sound

        // Look into lowering the Audio Bitrate

        //RmySound7.start();

        mySound.play(Kicked, 1, 1, 1, 0, 1);

    }


    public void mySound10(View view) {

        // This will play the "Eat a Dick" Sound

        mySound.play(Eat, 1, 1, 1, 0, 1);

    }

    public void mySound11(View view) {

        // This will play the "Ass Whooping Express" Sound

        //Look into lowering the Audio Bitrate

        //RmySound8.start();

        mySound.play(Express, 1, 1, 1, 0, 1);

    }


    public void mySound12(View view) {

        // This will play the "All Aboard" Sound

        mySound.play(Aboard, 1, 1, 1, 0, 1);

    }


}
