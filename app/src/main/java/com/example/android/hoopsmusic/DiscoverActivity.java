package com.example.android.hoopsmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DiscoverActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Finds the View that shows team music category
        ImageView team1Music = (ImageView) findViewById(R.id.team_1);

        //sets click listener on that View

        team1Music.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent team1MusicIntent = new Intent(DiscoverActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(team1MusicIntent);
            }
        });
        // Finds the View that shows player music category
        ImageView player1Music = (ImageView) findViewById(R.id.player_1);

        //sets click listener on that View

        player1Music.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent player1MusicIntent = new Intent(DiscoverActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(player1MusicIntent);

            }
        });
        // Finds the View that shows artist music category

        ImageView artist1Music = (ImageView) findViewById(R.id.artist_1);

        //sets click listener on that View

        artist1Music.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent artist1MusicIntent = new Intent(DiscoverActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(artist1MusicIntent);


            }
        });
    }
}
