package com.quint.spotify;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;
import android.widget.LinearLayout;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button random = findViewById(R.id.all_button);
        Button music = findViewById(R.id.music_button);
        Button pods = findViewById(R.id.podcasts_button);

        ImageView aaaaa = findViewById(R.id.home_button);
        aaaaa.setImageResource(R.drawable.material_symbols_home);
        final String[] random_button_state = {"on"};
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (random_button_state[0] == "on") {
                    random.getBackground().setTint(Color.parseColor("#333333"));
                    random_button_state[0] = String.valueOf("off"); // Toggle state
                } else {
                    random.getBackground().setTint(Color.parseColor("#45A956"));
                    random_button_state[0] = String.valueOf("on"); // Toggle state
                }
                Log.d("test", "current_button_state"+ Arrays.toString(random_button_state));
            }
        });

        final String[] music_button_state = {"on"};
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music_button_state[0] == "on") {
                    music.getBackground().setTint(Color.parseColor("#333333"));
                    music_button_state[0] = String.valueOf("off"); // Toggle state
                } else {
                    music.getBackground().setTint(Color.parseColor("#45A956"));


                    music_button_state[0] = String.valueOf("on"); // Toggle state
                }
                Log.d("test", "current_button_state"+ Arrays.toString(music_button_state));
            }
        });

        final String[] pods_button_state = {"on"};
        pods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pods_button_state[0] == "on") {
                    pods.getBackground().setTint(Color.parseColor("#333333"));
                    pods_button_state[0] = String.valueOf("off"); // Toggle state
                } else {
                    pods.getBackground().setTint(Color.parseColor("#45A956"));
                    pods_button_state[0] = String.valueOf("on"); // Toggle state
                }
                Log.d("test", "current_button_state"+ Arrays.toString(pods_button_state));
            }
        });

        LinearLayout playlist_page = findViewById(R.id.click_me);
        playlist_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });


        //        -----------------------------------------------------------------

        ImageView homePage = findViewById(R.id.home_button);
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        //        -----------------------------------------------------------------

        ImageView searchPage = findViewById(R.id.search_button);
        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        //        -----------------------------------------------------------------

        ImageView libraryPage = findViewById(R.id.library_button);
        libraryPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(intent);
                Log.d("username", "hello welcome back");
            }
        });
    }}