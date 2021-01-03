package com.example.dev.soundboardv4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    final int [] Imgs = {
            R.drawable.fleece,
            R.drawable.anime_eye,
            R.drawable.suit,
            R.drawable.utube,
            R.drawable.animation

            // The drawable Images for the Menu appears here
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        String [] characters = {
                "Boondocks",
                "Anime",
                "Other",
                "Youtube",
                "Credits"

        };

        ListAdapter MenuAdapter = new menu_layout1(this, characters, Imgs);
        ListView MainMenuList = (ListView) findViewById(R.id.LstMenu);
        MainMenuList.setAdapter(MenuAdapter);

        MainMenuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case  0:

                        //This is for the Boondocks Sounds Activity

                        Intent newActivity = new Intent(MainMenu.this, MainActivity.class);
                        startActivity(newActivity);

                         /* Toast.makeText(getApplicationContext(),
                                "The Boondocks Page will be available next patch",
                                Toast.LENGTH_LONG).show(); */

                    break;

                    case  1:

                        //This is for the Anime Sounds Activity

                       Intent newActivity1 = new Intent(MainMenu.this, Anime_sound.class);
                        startActivity(newActivity1);

                       /* Toast.makeText(getApplicationContext(),
                                "The Anime Page will be available next patch",
                                Toast.LENGTH_LONG).show(); */

                    break;

                    case  2:

                        //This is for the Other Sounds Activity

                           Intent newActivity2 = new Intent(MainMenu.this, Other.class);
                            startActivity(newActivity2);

                            /*Toast.makeText(getApplicationContext(),
                                "The Other Page will be available soon",
                                Toast.LENGTH_LONG).show();  */


                    break;


                    case  3:

                        //This is for the Youtube Activity

                        Intent newActivity3 = new Intent(MainMenu.this, Utube.class);
                        startActivity(newActivity3);

                        /*Toast.makeText(getApplicationContext(),
                                "Credits will be available next patch",
                                Toast.LENGTH_LONG).show(); */



                        break;

                    case 4:

                            //This links int the Credits Activity

                            Intent newActivity4 = new Intent(MainMenu.this, credits.class);
                            startActivity(newActivity4);

                             Toast.makeText(getApplicationContext(),
                                "Credits will be available next patch",
                                Toast.LENGTH_LONG).show();

                        break;


                }
            }
        });

    }
}
