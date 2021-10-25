package com.example.uts1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts1.Adapter.UserRecyclerAdapter;
import com.example.uts1.databinding.ActivityArtikelBinding;
import com.example.uts1.entity.Artikel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class ArtikelActivity extends AppCompatActivity implements UserRecyclerAdapter.RecyclerViewClickListener {
    private BottomNavigationView menuNavigation1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_artikel);
        menuNavigation1 = findViewById(R.id.bottom_navigation1);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ActivityArtikelBinding activityArtikelBinding = ActivityArtikelBinding.inflate(getLayoutInflater());
        setContentView(activityArtikelBinding.getRoot());

        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getUserList());
        activityArtikelBinding.recyclerView.setAdapter(userRecyclerAdapter);
        activityArtikelBinding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



        menuNavigation1.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_chat) {
                    startActivity(new Intent(ArtikelActivity.this, MainActivity.class));
                    finish();
                    return true;
                } else if (item.getItemId() == R.id.menu_artikel) {
                    startActivity(new Intent(ArtikelActivity.this, ArtikelActivity.class));
                    finish();
                    return true;
                } else if (item.getItemId() == R.id.menu_profil) {
                    startActivity(new Intent(ArtikelActivity.this, ProfilActivity.class));
                    finish();
                    return true;
                }

                return false;
            }
        });

    }

    private List<Artikel> getUserList() {
        List<Artikel> artikelList = new ArrayList<>();
        artikelList.add(new Artikel("https://picsum.photos/id/1080/6858/4574", "Buah", "9 Buah yang Paling Banyak Mengandung Vitamin C", "Selama ini, banyak orang beranggapan.."));
        artikelList.add(new Artikel("https://picsum.photos/id/1010/5184/3456", "Anak", "Tanda Anak Kurang Perhatian Orangtua dan Efeknya", "Tanpa disadari, banyak orangtua yang tidak.."));
        artikelList.add(new Artikel("https://picsum.photos/id/1025/4951/3301", "Hewan", "Ini Ciri-Ciri Anjing yang Terinfeksi", "Rabies tidak hanya menjangkit hewan.."));
        artikelList.add(new Artikel("https://cdn.hellosehat.com/wp-content/uploads/2019/06/shutterstock_1258029415.jpg", "Gigi", "2 Pilihan Obat untuk Sakit Gigi Berlubang", "Dikutip dari Mayo Clinic, gigi berlubang.."));
        artikelList.add(new Artikel("https://cdn.hellosehat.com/wp-content/uploads/2017/01/dampak-psikologis-pernikahan-usia-remaja.jpg", "Remaja", "Dampak Psikologis Pernikahan Dini","Angka pernikahan usia remaja (di bawah 18 tahun) di.."));
        artikelList.add(new Artikel("https://picsum.photos/id/1080/6858/4574", "Buah", "9 Buah yang Paling Banyak Mengandung Vitamin C", "Selama ini, banyak orang beranggapan.."));
        artikelList.add(new Artikel("https://picsum.photos/id/1010/5184/3456", "Anak", "Tanda Anak Kurang Perhatian Orangtua dan Efeknya", "Tanpa disadari, banyak orangtua yang tidak.."));
        artikelList.add(new Artikel("https://picsum.photos/id/1025/4951/3301", "Hewan", "Ini Ciri-Ciri Anjing yang Terinfeksi", "Rabies tidak hanya menjangkit hewan.."));
        artikelList.add(new Artikel("https://cdn.hellosehat.com/wp-content/uploads/2019/06/shutterstock_1258029415.jpg", "Gigi", "2 Pilihan Obat untuk Sakit Gigi Berlubang", "Dikutip dari Mayo Clinic, gigi berlubang.."));
        artikelList.add(new Artikel("https://cdn.hellosehat.com/wp-content/uploads/2017/01/dampak-psikologis-pernikahan-usia-remaja.jpg", "Remaja", "Dampak Psikologis Pernikahan Dini","Angka pernikahan usia remaja (di bawah 18 tahun) di.."));

        return artikelList;
    }






    @Override
    public void onClick(int position) {
       // RecyclerView.get(position);
        Intent intent = new Intent(ArtikelActivity.this,IsiArtikel.class);
        startActivity(intent);
    }
}
