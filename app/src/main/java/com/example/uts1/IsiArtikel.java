package com.example.uts1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class IsiArtikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_artikel);
        TextView tag = findViewById(R.id.TagTextView1);
        TextView judul = findViewById(R.id.judulTextView1);
        TextView isi = findViewById(R.id.isiTextView1);

    }


}