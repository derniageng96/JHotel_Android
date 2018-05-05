package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/3/2018.
 */

public class Hotel
{
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(int id, String nama, Lokasi lokasi, int bintang) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama()
    {
        return nama;
    }
    public void setNama()
    {
        this.nama=nama;
    }

    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    public int getBintang()
    {
        return bintang;
    }

    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
}
