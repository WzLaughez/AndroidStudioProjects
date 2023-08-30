package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farizramadhan.tugasbesar.adapter.hotel_adapater;
import com.farizramadhan.tugasbesar.model.hotel;

import java.util.ArrayList;
import java.util.List;

public class Beranda_Bandung extends AppCompatActivity {

    List<hotel> hotelList = new ArrayList<>();
    RecyclerView recyclerView;
    com.farizramadhan.tugasbesar.adapter.hotel_adapater hotel_adapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_bandung);
        //sambungkan variabel global dengan id yang ada di view
        recyclerView = findViewById(R.id.hotelbandung);
        hotel_adapater = new hotel_adapater(hotelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(hotel_adapater);

        hotelList.add(new hotel("O Collection Hotel","Rp. 300.000,-/ kamar","Single Bed","AC","Book Now",R.drawable.o_collection_bandung));
        hotelList.add(new hotel("Hotel Lembang","Rp. 250.000,-/ kamar","Twin Bed","Kipas Angin","Book Now",R.drawable.hotel_bandung_aa));
        hotelList.add(new hotel("Hotel Great Asia Afrika","Rp. 275.000,-/ kamar","Double bed","AC / Kipas","Book Now",R.drawable.lembang));
    }
}