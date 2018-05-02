package com.example.pemiluapps;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView mTextPilihBahasa;
    ImageView mProfileCalon;
    ImageView mIconPemilu;
    ImageView mBuku;
    ImageView mPemilihPemula;

    public int[] lst_images = {
            R.drawable.icon_calon,
            R.drawable.orang,
            R.drawable.icon_pemilu,
            R.drawable.buku,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTextPilihBahasa = (TextView) findViewById(R.id.pilihBahasa);
        mProfileCalon = (ImageView) findViewById(R.id.profileCalon);
        mProfileCalon.setImageResource(lst_images[0]);
        mIconPemilu = (ImageView) findViewById(R.id.IconPemilu);
        mIconPemilu.setImageResource(lst_images[2]);
        mBuku = (ImageView) findViewById(R.id.Buku);
        mBuku.setImageResource(lst_images[3]);
        mPemilihPemula = (ImageView) findViewById(R.id.Orang);
        mPemilihPemula.setImageResource(lst_images[1]);
        mTextPilihBahasa.setText(getIntent().getExtras().getString("bahasa"));

        mProfileCalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(Home.this, daftarCalon.class);
                sharedIntent.putExtra("bahasa", getIntent().getExtras().getString("bahasa"));
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Home.this);
                startActivity(sharedIntent, options.toBundle());
            }
        });

        mPemilihPemula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(Home.this, PemilihPemula.class);
                sharedIntent.putExtra("bahasa", getIntent().getExtras().getString("bahasa"));
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Home.this);
                startActivity(sharedIntent, options.toBundle());
            }
        });

        mIconPemilu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharedIntent = new Intent(Home.this, PolitikUang.class);
                sharedIntent.putExtra("bahasa", getIntent().getExtras().getString("bahasa"));
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Home.this);
                startActivity(sharedIntent, options.toBundle());
            }
        });
    }
}
