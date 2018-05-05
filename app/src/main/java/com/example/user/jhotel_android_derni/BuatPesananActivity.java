package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/5/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BuatPesananActivity extends AppCompatActivity {
    private int currentUserid, banyakHari, idHotel;
    private double tariff;
    private String roomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_pesanan);


    }
}