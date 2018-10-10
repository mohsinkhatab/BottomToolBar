package com.example.mohsin.bottomtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.fav) {
            Intent intent = new Intent(MainActivity.this, Favourite.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Favourite", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.msg) {
            Intent intent = new Intent(MainActivity.this, Message.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Messages", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cl) {
            Intent intent = new Intent(MainActivity.this, Calls.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Calls", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.video) {
            Intent intent = new Intent(MainActivity.this, VideoCall.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Video Call", Toast.LENGTH_SHORT).show();

            return super.onOptionsItemSelected(item);
        }

        return true;
    }
}
