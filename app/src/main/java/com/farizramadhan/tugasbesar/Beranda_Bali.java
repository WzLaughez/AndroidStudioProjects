package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farizramadhan.tugasbesar.adapter.hotel_adapater;
import com.farizramadhan.tugasbesar.model.hotel;

import java.util.ArrayList;
import java.util.List;

public class Beranda_Bali extends AppCompatActivity {

    List<hotel> hotelList = new ArrayList<>();
    RecyclerView recyclerView;
    com.farizramadhan.tugasbesar.adapter.hotel_adapater hotel_adapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_bali);
        recyclerView = findViewById(R.id.hotelbali);
        hotel_adapater = new hotel_adapater(hotelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(hotel_adapater);

        hotelList.add(new hotel("Nusa Dua Hotel","Rp. 1.500.000,-/ kamar","Single Bed","AC & Kipas","Book Now",R.drawable.nusadua));
        hotelList.add(new hotel("Uluwatu Hotel","Rp. 1.250.000,-/ kamar","Double bed","AC & Kipas","Book Now",R.drawable.uluwatu));
        hotelList.add(new hotel("Kuta Hotel","Rp. 800.000,-/ kamar","Twin Bed","AC & Kipas","Book Now",R.drawable.kuta));
    }
}