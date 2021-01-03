package com.example.dev.soundboardv4;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Other extends AppCompatActivity {

    SoundPool myOtherOST;

    MediaPlayer OtherMedia;

    int MGS;
    int SouthPark;
    int Doge;
    int Lost;
    int Combo;
    int YouSlain;
    int LosingHorn;
    int Mission;
    int Startup;
    int Shutdown;




    MediaPlayer RmyOtherOST1;
    MediaPlayer RmyOtherOST2;
    MediaPlayer RmyOtherOST3;
    MediaPlayer RmyOtherOST4;
    MediaPlayer RmyOtherOST5;
    MediaPlayer RmyOtherOST6;
    MediaPlayer RmyOtherOST7;
    MediaPlayer RmyOtherOST8;
    MediaPlayer RmyOtherOST9;
    MediaPlayer RmyOtherOST10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        myOtherOST = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);



        //Needs to sort out the media player code in order to play a longer audio

        MGS = myOtherOST.load(this, R.raw.mgs, 1);
        SouthPark = myOtherOST.load(this, R.raw.hu_waa_waa, 1);
        Doge = myOtherOST.load(this, R.raw.hype_dog, 1);
        Lost = myOtherOST.load(this, R.raw.death, 1);
        Combo = myOtherOST.load(this, R.raw.ultra_combo, 1);
        YouSlain = myOtherOST.load(this, R.raw.you_have_been_slain, 1);
        LosingHorn = myOtherOST.load(this, R.raw.the_price_is_right_losing_horn, 1);
        Mission = myOtherOST.load(this, R.raw.mission_failed, 1);
        Startup = myOtherOST.load(this, R.raw.xp_startup_sound, 1);
        Shutdown = myOtherOST.load(this, R.raw.xp_shutdown_sound, 1);


        // Code for the floating button
        FloatingActionButton fabYoutube = (FloatingActionButton) findViewById(R.id.Fab_Youtube);
        fabYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Other.this, MainMenu.class);
                startActivity(intent);
            }
        });





    }

    public void myOtherOST1(View view) {

        // This will play the "Metal Gear Solid Alert" Sound

        myOtherOST.play(MGS, 1, 1, 1, 0, 1);

    }

    public void myOtherOST2(View view) {

        //This will play the "Hu Waa Waa" Sound

        myOtherOST.play(SouthPark, 1, 1, 1, 0, 1);

    }

    public void myOtherOST3(View view) {

        //This will play the "Hype Dog" Sound

        myOtherOST.play(Doge, 1, 1, 1, 0, 1);

    }

    public void myOtherOST4(View view) {

        //This will play the "Rayman Death" Sound

        myOtherOST.play(Lost, 1, 1, 1, 0, 1);


    }

    public void myOtherOST5(View view) {

        //This will play the "Ultra Combo" Sound

        myOtherOST.play(Combo, 1, 1, 1, 0, 1);

    }

    public void myOtherOST6(View view) {

        //This will play the "You have been Slain" Sound

        myOtherOST.play(YouSlain, 1, 1, 1, 0, 1);

    }

    public void myOtherOST7(View view) {

        //This will play the "Losing Horn" Sound

        myOtherOST.play(LosingHorn, 1, 1, 1, 0, 1);

    }

    public void myOtherOST8(View view) {

        //This will play the "Mission Failed" Sound

        myOtherOST.play(Mission, 1, 1, 1, 0, 1);

    }

    public void myOtherOST9(View view) {

        //This will play the "Windows Xp Startup" Sound

        myOtherOST.play(Startup, 1, 1, 1, 0, 1);
    }

    public void myOtherOST10(View view) {

        //This will play the "Windows Xp Shut Down" Sound

        myOtherOST.play(Shutdown, 1, 1, 1, 0, 1);
    }
}
