package com.example.android.hoopsmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the view that shows Discover Section

        Button discover = (Button) findViewById(R.id.discover_button);

        //sets click listener on that View
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link DiscoverActivity}

                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);

                //starts new activity
                startActivity(discoverIntent);
            }
        });

        //Finds the view that shows Playlist Section

        Button playlist = (Button) findViewById(R.id.playlist_button);

        //sets click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                //Creates an intent to open {@link PlaylistActivity}

                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                //starts new activity
                startActivity(playlistIntent);
            }
        });

        //Finds the view that shows SearchSection

        Button nowplaying = (Button) findViewById(R.id.nowplaying_button);

        //sets click listener on that View
        nowplaying.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                //Creates an intent to open {@link SearchActivity}

                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(nowplayingIntent);
            }
        });

        //Finds the view that shows Radio Section

        Button radio = (Button) findViewById(R.id.radio_button);

        //sets click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                //Creates an intent to open {@link RadioActivity}

                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);

                //starts new activity
                startActivity(radioIntent);
            }
        });
    }
}