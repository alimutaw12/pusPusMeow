package com.example.pemiluapps;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnJawa;
    Button mBtnIndo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnIndo = (Button) findViewById(R.id.btnIndo);
        mBtnJawa = (Button) findViewById(R.id.btnJawa);

        mBtnIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(MainActivity.this, Home.class);
                sharedIntent.putExtra("bahasa", "Indonesia");
                startActivity(sharedIntent);
            }
        });

        mBtnJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(MainActivity.this, Home.class);
                sharedIntent.putExtra("bahasa", "Jawa");
                startActivity(sharedIntent);
            }
        });

    }
}
