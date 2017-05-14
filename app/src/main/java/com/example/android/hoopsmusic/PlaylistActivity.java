package com.example.android.hoopsmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlaylistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Finds the View that shows before game beats category
        TextView playlist1 = (TextView) findViewById(R.id.playlist_1);

        //sets click listener on that View

        playlist1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent playlist1Intent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(playlist1Intent);
            }
        });

        // Finds the View that shows after game beats category
        TextView playlist2 = (TextView) findViewById(R.id.playlist_2);

        //sets click listener on that View

        playlist2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent playlist2Intent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(playlist2Intent);
            }
        });
        // Finds the View that shows practice beats category
        TextView playlist3 = (TextView) findViewById(R.id.playlist_3);

        //sets click listener on that View

        playlist3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link NowPlayingActivity}
                Intent playlist3Intent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);

                //starts new activity
                startActivity(playlist3Intent);

            }
        });
        // Finds the View that shows +add new beat category
        TextView addNewBeat = (TextView) findViewById(R.id.add_new_beat);

        //sets click listener on that View

        addNewBeat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "New Beat Added", Toast.LENGTH_LONG).show();}
        });




    }
}




