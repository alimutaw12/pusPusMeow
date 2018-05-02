package com.example.pemiluapps;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class daftarCalon extends AppCompatActivity {
    TextView mTextPilihBahasa;
    ImageView mCalonPertama;
    ImageView mCalonKedua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_calon);
        mTextPilihBahasa = (TextView) findViewById(R.id.pilihBahasa);
        mTextPilihBahasa.setText(getIntent().getExtras().getString("bahasa"));
        mCalonPertama = (ImageView) findViewById(R.id.calonPertama);
        mCalonPertama.setImageResource(R.drawable.calon_1);
        mCalonKedua = (ImageView) findViewById(R.id.calonKedua);
        mCalonKedua.setImageResource(R.drawable.calon_2);

        mCalonPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(daftarCalon.this, ProfileCalon.class);
                sharedIntent.putExtra("bahasa", getIntent().getExtras().getString("bahasa"));
                sharedIntent.putExtra("noUrut", 0);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(daftarCalon.this);
                startActivity(sharedIntent, options.toBundle());
            }
        });

        mCalonKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(daftarCalon.this, ProfileCalon.class);
                sharedIntent.putExtra("bahasa", getIntent().getExtras().getString("bahasa"));
                sharedIntent.putExtra("noUrut", 1);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(daftarCalon.this);
                startActivity(sharedIntent, options.toBundle());
            }
        });
    }
}
