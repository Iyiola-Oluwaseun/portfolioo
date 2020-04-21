package com.example.portfolioo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;
    int[] imageId = {
            R.drawable.ade,
            R.drawable.me,
            R.drawable.whatsapp,
            R.drawable.facebook,
            R.drawable.docker,
            R.drawable.twitter,
            R.drawable.google,
            R.drawable.youtube,
            R.drawable.linkedin,
            R.drawable.git,
            R.drawable.reddit,

    };
    String[] web = {
            "About",
            "Mobile Dev",
            "Whatsapp",
            "Facebook",
            "Twitter",
            "Google",
            "Youtube",
            "Linkedin",
            "Git",
            "Reddit",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"

    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageAdapter adapter = new ImageAdapter(MainActivity.this,web,
                imageId);
        GridView grid=(GridView)findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });

    }
}

