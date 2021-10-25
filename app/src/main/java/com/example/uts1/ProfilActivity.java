package com.example.uts1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationManagerCompat;

import com.example.uts1.Preferences.UserPreferences;

public class ProfilActivity extends AppCompatActivity {
    UserPreferences userPreferences;
    private NotificationManagerCompat notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        userPreferences = new UserPreferences(ProfilActivity.this);
        TextView tvNama,tvJenisKelamin,tvAlamat,tvEmail,tvNoTelp,tvUbah;
        CardView cvKeluar,cvLokasi;
        ImageView ivBack;


        tvNama = findViewById(R.id.tv_nama);
        tvJenisKelamin = findViewById(R.id.tv_jenisKelamin);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvEmail = findViewById(R.id.tv_email);
        tvNoTelp = findViewById(R.id.tv_noTelp);
        cvKeluar = findViewById(R.id.cv_keluar);
        cvLokasi = findViewById(R.id.lokasi);
        ivBack = findViewById(R.id.iv_back);
        tvUbah = findViewById(R.id.tv_ubah);

        userPreferences.getUserLogin();
        checkLogin();
        tvNama.setText(userPreferences.getUserLogin().getName());
        tvAlamat.setText(userPreferences.getUserLogin().getAlamat());
        tvJenisKelamin.setText(userPreferences.getUserLogin().getJenisKelamin());
        tvEmail.setText(userPreferences.getUserLogin().getEmail());
        tvNoTelp.setText(userPreferences.getUserLogin().getAlamat());

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilActivity.this, MainActivity.class));
            }
        });

        tvUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilActivity.this, EditActivity.class));
            }
        });

        cvLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilActivity.this, LokasiActivity.class));
            }
        });

        cvKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userPreferences.logout();
                Toast.makeText(ProfilActivity.this, "Selamat Tinggal",
                        Toast.LENGTH_SHORT)
                        .show();
                checkLogin();
            }
        });
    }

    private void checkLogin() {
        if (!userPreferences.checkLogin()){
            startActivity(new Intent(ProfilActivity.this, LoginActivity.class));
        }
    }
}
