package com.example.mohsin.bottomtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Calls extends AppCompatActivity {
TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);
        txt2=(TextView)findViewById(R.id.cls);
    }
}
