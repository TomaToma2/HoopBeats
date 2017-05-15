package com.example.android.hoopsmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RadioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);


        // Finds the View that shows Home Section
        TextView home = (TextView) findViewById(R.id.home_button);

        //sets click listener on that View

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Creates an intent to open {@link MainActivity}
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);

                //starts new activity
                startActivity(homeIntent);
            }
        });

        // Finds the View that shows Radio One Station
        ImageView radioOne = (ImageView) findViewById(R.id.radio_1);

        //sets click listener on that View

        radioOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Radio One", Toast.LENGTH_LONG).show();
            }
        });

        // Finds the View that shows Radio Two Station
        ImageView radioTwo = (ImageView) findViewById(R.id.radio_2);

        //sets click listener on that View

        radioTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Radio Two", Toast.LENGTH_LONG).show();
            }
        });
        // Finds the View that shows Radio Three Station
        ImageView radioThree = (ImageView) findViewById(R.id.radio_3);

        //sets click listener on that View

        radioThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Radio Three", Toast.LENGTH_LONG).show();
            }
        });

        // Finds the View that shows Radio Four Station
        ImageView radioFour = (ImageView) findViewById(R.id.radio_4);

        //sets click listener on that View

        radioFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Radio Four", Toast.LENGTH_LONG).show();
            }
        });
        // Finds the View that shows Radio Five Station
        ImageView radioFive = (ImageView) findViewById(R.id.radio_5);

        //sets click listener on that View

        radioFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Radio Five", Toast.LENGTH_LONG).show();
            }
        });

        // Finds the View that shows Previous Button
        ImageView previousButton = (ImageView) findViewById(R.id.previous_button);

        //sets click listener on that View

        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Previous", Toast.LENGTH_LONG).show();
            }
        });

        // Finds the View that shows Play Button
        ImageView playButton = (ImageView) findViewById(R.id.play_button);

        //sets click listener on that View

        playButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Play", Toast.LENGTH_LONG).show();
            }
        });

        // Finds the View that shows Next Button
        ImageView nextButton = (ImageView) findViewById(R.id.next_button);

        //sets click listener on that View

        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creates a Toast
                Toast.makeText(view.getContext(), "Next", Toast.LENGTH_LONG).show();
            }
        });
    }
}





