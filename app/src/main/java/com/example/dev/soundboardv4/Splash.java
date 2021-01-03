package com.example.dev.soundboardv4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread Timer = new Thread() {

            public void run () {

                try { sleep(4000);
                    Intent i = new Intent(Splash.this, MainMenu.class);
                    startActivity(i);
                    finish();
                }
                catch (InterruptedException e) {
                    e.printStackTrace(); }
            }


        }; Timer.start();
    }

}
