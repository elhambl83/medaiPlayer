package com.example.myappplay;
import static com.example.myappplay.R.*;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

MediaPlayer music;
Button start,pause,stop;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        music= MediaPlayer.create(this, R.raw.play1);
        start= findViewById(id.start);
        pause= findViewById(id.pause);
        stop= findViewById(id.stop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.start();
                pause.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       music.pause();
                       stop.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               music.stop();
                           }
                       });
                    }
                });
            }
        });
    }
}