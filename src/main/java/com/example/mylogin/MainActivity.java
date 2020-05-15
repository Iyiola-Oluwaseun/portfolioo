package com.example.mylogin;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);


                                Intent intentSharedPreferences = new Intent(MainActivity.this, SharedPreferencesActivity.class);
                                startActivity(intentSharedPreferences);
    }
    }

