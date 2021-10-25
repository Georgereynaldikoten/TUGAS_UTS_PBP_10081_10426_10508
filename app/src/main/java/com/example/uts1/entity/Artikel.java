package com.example.uts1.entity;

import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;

public class Artikel {
    public String gambar;
    public String tag;
    public String judul;
    public String isi;

    public Artikel(String gambar, String tag, String judul, String isi){
        this.gambar = gambar;
        this.tag = tag;
        this.judul = judul;
        this.isi = isi;
    }

    public String getGambar() {
        return gambar;
    }
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) { this.tag = tag; }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }
    public void setIsi(String isi) {
        this.isi = isi;
    }


    @Override
    public String toString() {
        return "User{" +
                "judul='" + judul + '\'' +
                ", tag=" + tag +
                ", isi=" + isi +
                ", gambar='" + gambar + '\'' +
                '}';
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }
}