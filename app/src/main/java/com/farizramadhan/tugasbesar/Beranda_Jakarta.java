package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farizramadhan.tugasbesar.adapter.hotel_adapater;
import com.farizramadhan.tugasbesar.model.hotel;

import java.util.ArrayList;
import java.util.List;

public class Beranda_Jakarta extends AppCompatActivity {

    List<hotel> hotelList = new ArrayList<>();
    RecyclerView recyclerView;
    hotel_adapater hotel_adapater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_jakarta);
        //sambungkan variabel global dengan id yang ada di view
        recyclerView = findViewById(R.id.hoteljakarta);
        hotel_adapater = new hotel_adapater(hotelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(hotel_adapater);

        hotelList.add(new hotel("Daily inn","Rp. 200.000,-/ kamar","Twin super bed","AC","Book Now",R.drawable.daily_inn_jakarta));
        hotelList.add(new hotel("Hotel Senen","Rp. 180.000,-/ kamar","Mega bed","AC / Kipas","Book Now",R.drawable.hotel_senen_indah));
        hotelList.add(new hotel("Hotel Bungur","Rp. 150.000,-/ kamar","Single bed","AC / Kipas","Book Now",R.drawable.daily_inn_jkt));
    }
}