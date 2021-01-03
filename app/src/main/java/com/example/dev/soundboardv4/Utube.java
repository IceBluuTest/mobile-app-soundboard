package com.example.dev.soundboardv4;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Utube extends AppCompatActivity {

    SoundPool myYoutubeOST;

    MediaPlayer NewMedia;

    int Low;
    int Mid;
    int Throw;
    int Rank;
    int Hate;
    int Whyy;
    int Jeezus;
    int Nice;



    MediaPlayer RmyYoutubeOST1;
    MediaPlayer RmyYoutubeOST2;
    MediaPlayer RmyYoutubeOST3;
    MediaPlayer RmyYoutubeOST4;
    MediaPlayer RmyYoutubeOST5;
    MediaPlayer RmyYoutubeOST6;
    MediaPlayer RmyYoutubeOST7;
    MediaPlayer RmyYoutubeOST8;
    MediaPlayer RmyYoutubeOST9;
    MediaPlayer RmyYoutubeOST10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utube);

        //This is for the Soundboards remove the relevant audio files
        //Excluding the 1st line (myYoutubeOST) part

        myYoutubeOST = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);



        //Needs to sort out the media player code in order to play a longer audio

        Low = myYoutubeOST.load(this, R.raw.low_attack, 1);
        Mid = myYoutubeOST.load(this, R.raw.mid, 1);
        Throw = myYoutubeOST.load(this, R.raw.threw_me, 1);
        Rank = myYoutubeOST.load(this, R.raw.take_my_rank, 1);
        Hate = myYoutubeOST.load(this, R.raw.i_hate_this_game, 1);
        Whyy = myYoutubeOST.load(this, R.raw.whhyyy, 1);
        Jeezus = myYoutubeOST.load(this, R.raw.jesus, 1);
        Nice = myYoutubeOST.load(this, R.raw.click_nice, 1);



        // Code for the floating button
        FloatingActionButton fabYoutube = (FloatingActionButton) findViewById(R.id.Fab_Youtube);
        fabYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Utube.this, MainMenu.class);
                startActivity(intent);
            }
        });




    }

    public void myYoutubeOST1(View view) {

        //Plays "You Did a low attack" sound

        myYoutubeOST.play(Low, 1, 1, 1, 0, 1);

    }


    public void myYoutubeOST2(View view) {

        //Plays "Ducked a Mid" sound

        myYoutubeOST.play(Mid, 1, 1, 1, 0, 1);
    }

    public void myYoutubeOST3(View view) {

        //Plays "He even Threw me" sound

        myYoutubeOST.play(Throw, 1, 1, 1, 0, 1);
    }

    public void myYoutubeOST4(View view) {

        //Plays "Just to take my Rank" sound

        myYoutubeOST.play(Rank, 1, 1, 1, 0, 1);
    }

    public void myYoutubeOST5(View view) {

        //Plays "I Hate this game soo much" sound

        myYoutubeOST.play(Hate, 1, 1, 1, 0, 1);

    }


    public void myYoutubeOST6(View view) {

        //Plays "Whhhhyyy !!!" sound

        myYoutubeOST.play(Whyy, 1, 1, 1, 0, 1);

    }


    public void myYoutubeOST7(View view) {

        // Play the "Jeesus" Sound

        myYoutubeOST.play(Jeezus, 1, 1, 1, 0, 1);

    }

    public void myYoutubeOST8(View view) {

        // Play the "Nice" Sound

        myYoutubeOST.play(Nice, 1, 1, 1, 0, 1);
    }
}
