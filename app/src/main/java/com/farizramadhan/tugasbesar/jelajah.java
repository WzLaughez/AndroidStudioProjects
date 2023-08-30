package com.farizramadhan.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class jelajah extends AppCompatActivity {
EditText id;
EditText pw;
String dapatkanID;
String dapatkanPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jelajah);
        id = findViewById(R.id.username);
        pw = findViewById(R.id.password);
    }
    public void masuk(View view) {

        dapatkanID = id.getText().toString();
        dapatkanPW = pw.getText().toString();
        if ( dapatkanPW.equals("Ramadhan")) {
            Intent masuk = new Intent(this, Beranda_Hotel.class);
            masuk.putExtra("User", dapatkanID);
            startActivity(masuk);
        }
    }
}