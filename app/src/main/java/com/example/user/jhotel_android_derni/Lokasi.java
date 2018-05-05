package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/3/2018.
 */

public class Lokasi {
    private double x_cord;
    private double y_cord;
    private String deskripsi;

    public Lokasi(double x_cord, double y_cord, String deskripsi) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi()
    {
        return deskripsi;
    }
    public double getX_cord()
    {
        return x_cord;
    }
    public double getY_coord()
    {
        return y_cord;
    }
    public void setX_cord(double x_cord)
    {
        this.x_cord=x_cord;
    }
    public void setY_cord(double y_cord)
    {
        this.y_cord=y_cord;
    }
    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
}
