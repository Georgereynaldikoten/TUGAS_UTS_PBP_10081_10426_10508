package com.example.uts1.entity;

import java.util.ArrayList;

public class DaftarDrHewan
{
    public ArrayList<Dokter> DrHewan;

    public DaftarDrHewan()
    {
        DrHewan = new ArrayList<>();
        DrHewan.add(Anis);
        DrHewan.add(Ari);
        DrHewan.add(Ety);
        DrHewan.add(Anggi);
    }

    public static final Dokter Anis = new Dokter("Anis Hanifa Tiara, drh.","Dokter Hewan","111",
            "Klinik Hewan Jogja","https://image.freepik.com/free-photo/content-young-female-doctor-posing-camera_1262-18213.jpg", "Senin pukul 08.00 - 12.00");
    public static final Dokter Ari = new Dokter("Tri Ari Widiastuti, drh.","Dokter Hewab","112",
            "Klinik Hewan Jogja","https://image.freepik.com/free-photo/portrait-beautiful-young-asian-doctor-asian-woman_74190-10516.jpg", "Selasa pukul 08.00 - 12.00");
    public static final Dokter Ety = new Dokter("Ety Erarindah, drh. ","Dokter Hewan","113",
            "Klinik Hewan Jogja","https://image.freepik.com/free-photo/content-young-female-doctor-posing-camera_1262-18213.jpg", "Rabu pukul 08.00 - 12.00");
    public static final Dokter Anggi = new Dokter("Anggi Desterina Prayitno, drh. ","Dokter Hewan","114",
            "Klinik Hewan Jogja","https://image.freepik.com/free-photo/portrait-beautiful-young-asian-doctor-asian-woman_74190-10516.jpg", "Kamis pukul 08.00 - 12.00");
}
