package com.example.mohsin.bottomtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VideoCall extends AppCompatActivity {
TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_call);
        tt=(TextView)findViewById(R.id.vid);
    }
}
