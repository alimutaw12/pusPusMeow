package com.example.pemiluapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailCalon extends AppCompatActivity {
    TextView mTextPilihBahasa;
    ImageView mFotoCalon;
    ImageView mVisiMisi;
    ImageView mUang;
    ImageView mFing;
    ImageView mMission;
    ImageView mDetailCalon;
    ImageView mIdentitasWakil;
    ImageView mMission1;
    ImageView mMission2;
    ImageView mMission3;
    ImageView mBackgroud;

    int noUrut;
    int[] lst_image = {
        R.drawable.calonsatu,
        R.drawable.ganjar,
    };

    int[] lst_identitas = {
        R.drawable.identitas_said,
        R.drawable.identitas_ganjar,
        R.drawable.identitas_ida,
        R.drawable.identitas_tajyasin,
    };

    int[] lst_visi = {
        R.drawable.visi_sudirman,
        R.drawable.visi_ganjar,
    };

    int[] lst_misi = {
       R.drawable.misi_1_sudirman,
       R.drawable.misi_1_ganjar,
       R.drawable.misi_2_sudirman,
       R.drawable.misi_2_ganjar,
       R.drawable.misi_3_sudirman,
       R.drawable.misi_3_ganjar,
    };

    int[] lst_anggaran_dana = {
        R.drawable.anggaran_dana_sudirman,
        R.drawable.anggaran_dana_ganjar,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_calon);
        mTextPilihBahasa = (TextView) findViewById(R.id.pilihBahasa);
        mTextPilihBahasa.setText(getIntent().getExtras().getString("bahasa"));
        Intent receivedIntent = getIntent();
        noUrut = receivedIntent.getIntExtra("noUrut",-1);
        mFotoCalon = (ImageView) findViewById(R.id.fotoCalon);
        mFotoCalon.setImageResource(lst_image[noUrut]);
        mMission1 = (ImageView) findViewById(R.id.mission1);
        mMission2 = (ImageView) findViewById(R.id.mission2);
        mMission3 = (ImageView) findViewById(R.id.mission3);
        mFing = (ImageView) findViewById(R.id.fing);
        mFing.setImageResource(R.drawable.fing);
        mUang = (ImageView) findViewById(R.id.uang);
        mUang.setImageResource(R.drawable.uang);
        mMission = (ImageView) findViewById(R.id.mission);
        mMission.setImageResource(R.drawable.mission);
        mVisiMisi = (ImageView) findViewById(R.id.visiMisi);
        mVisiMisi.setImageResource(R.drawable.visi_misi);
        mDetailCalon = (ImageView) findViewById(R.id.detailCalon);
        mIdentitasWakil = (ImageView) findViewById(R.id.identitasWakil);
        mBackgroud = (ImageView) findViewById(R.id.imageView11);
        mBackgroud.setImageResource(R.drawable.coklat1);

        mFing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDetailCalon.setImageResource(lst_identitas[noUrut]);
                mMission1.setImageBitmap(null);
                mMission2.setImageBitmap(null);
                mMission3.setImageBitmap(null);
                mIdentitasWakil.setImageResource(R.drawable.next);
                mIdentitasWakil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       mDetailCalon.setImageResource(lst_identitas[noUrut+2]);
                    }
                });
            }
        });
        mVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIdentitasWakil.setImageBitmap(null);
                mMission1.setImageBitmap(null);
                mMission2.setImageBitmap(null);
                mMission3.setImageBitmap(null);
                mDetailCalon.setImageResource(lst_visi[noUrut]);
            }
        });

        mMission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMission1.setImageResource(R.drawable.misi1);
                mMission1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mDetailCalon.setImageResource(lst_misi[noUrut]);
                    }
                });
                mMission2.setImageResource(R.drawable.misi2);
                mMission2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mDetailCalon.setImageResource(lst_misi[noUrut+2]);
                    }
                });
                mMission3.setImageResource(R.drawable.misi3);
                mMission3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mDetailCalon.setImageResource(lst_misi[noUrut+4]);
                    }
                });

                mIdentitasWakil.setImageBitmap(null);
                mDetailCalon.setImageResource(lst_misi[noUrut]);
            }
        });

        mUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIdentitasWakil.setImageBitmap(null);
                mMission1.setImageBitmap(null);
                mMission2.setImageBitmap(null);
                mMission3.setImageBitmap(null);
                mDetailCalon.setImageResource(lst_anggaran_dana[noUrut]);
            }
        });
    }
}
