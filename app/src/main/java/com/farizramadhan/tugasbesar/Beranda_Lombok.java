package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farizramadhan.tugasbesar.adapter.hotel_adapater;
import com.farizramadhan.tugasbesar.model.hotel;

import java.util.ArrayList;
import java.util.List;

public class Beranda_Lombok extends AppCompatActivity {

    List<hotel> hotelList = new ArrayList<>();
    RecyclerView recyclerView;
    com.farizramadhan.tugasbesar.adapter.hotel_adapater hotel_adapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_lombok);
        //sambungkan variabel global dengan id yang ada di view
        recyclerView = findViewById(R.id.hotellombok);
        hotel_adapater = new hotel_adapater(hotelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(hotel_adapater);

        hotelList.add(new hotel("Senggigi Hotel","Rp. 400.000,-/ kamar","Double Bed","AC & Kipas","Book Now",R.drawable.senggigi));
        hotelList.add(new hotel("Mataram Hotel","Rp. 375.000,-/ kamar","Twin Bed","AC / Kipas","Book Now",R.drawable.mataram));
        hotelList.add(new hotel("Gili Hotel","Rp. 300.000,-/ kamar","Double bed","AC","Book Now",R.drawable.gili));
    }
}