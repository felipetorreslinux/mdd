package com.marydrive.Views;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.marydrive.R;

public class Intro extends AppCompatActivity implements View.OnClickListener{

    VideoView videoview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_intro);

        videoview = findViewById(R.id.videoview);
        MediaController mc = new MediaController(this);
        videoview.setMediaController(mc);
        Uri uri = Uri.parse("android.resource://com.com.marydrive.Views/" + R.raw.abc);
        videoview.setVideoURI(uri);
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        videoview.start();

    }

    @Override
    public void onClick(View v) {

    }
}
