package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Beranda_Hotel extends AppCompatActivity {
    TextView nama_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_hotel);
        nama_user = findViewById(R.id.nama_user);
        Intent judul = getIntent();
        nama_user.setText(judul.getStringExtra("User"));
    }

    public void ke_jakarta(View view){
        Intent jakarta = new Intent(this,Beranda_Jakarta.class);
        startActivity(jakarta);
    }

    public void ke_bandung(View view){
        Intent bandung = new Intent(this,Beranda_Bandung.class);
        startActivity(bandung);
    }
    public void ke_lombok(View view){
        Intent lombok = new Intent(this,Beranda_Lombok.class);
        startActivity(lombok);
    }
    public void ke_bali(View view){
        Intent bali = new Intent(this,Beranda_Bali.class);
        startActivity(bali);
    }
}