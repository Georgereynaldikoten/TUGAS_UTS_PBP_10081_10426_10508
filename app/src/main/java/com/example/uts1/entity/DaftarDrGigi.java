package com.example.uts1.entity;

import java.util.ArrayList;

public class DaftarDrGigi
{
    public ArrayList<Dokter> DrGigi;

    public DaftarDrGigi()
    {
        DrGigi = new ArrayList<>();
        DrGigi.add(Evy);
        DrGigi.add(Haryo);
        DrGigi.add(Julie);
        DrGigi.add(Kris);
    }

    public static final Dokter Evy = new Dokter("Evy Tri Utami, drg., Sp.KG","Dokter Gigi","107",
            "RS Panti Rapih Yogyakarta","https://image.freepik.com/free-photo/portrait-beautiful-young-asian-doctor-asian-woman_74190-10516.jpg", "Senin pukul 14.00 - 16.00");
    public static final Dokter Haryo = new Dokter("Haryo Mustiko, drg., Sp.Pros(K), Prof., Dr.","Dokter Gigi","108",
            "RS Panti Rapih Yogyakarta","https://img.freepik.com/free-photo/portrait-smiling-handsome-male-doctor-man_171337-5055.jpg?size=626&ext=jpg", "Selasa pukul 14.00 - 16.00");
    public static final Dokter Julie = new Dokter("Julie Christine L., drg., Sp.KGA","Dokter Gigi","109",
            "RS Panti Rapih Yogyakarta","https://image.freepik.com/free-photo/content-young-female-doctor-posing-camera_1262-18213.jpg", "Senin pukul 08.00 - 12.00");
    public static final Dokter Kris = new Dokter("Krisnovianto, drg., Sp.KG","Dokter Gigi","110",
            "RS Panti Rapih Yogyakarta","https://image.freepik.com/free-photo/smiling-asian-male-doctor-pointing-upwards_1262-18321.jpg", "Rabu pukul 08.00 - 12.00");
}
