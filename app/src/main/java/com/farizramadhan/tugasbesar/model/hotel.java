package com.farizramadhan.tugasbesar.model;

public class hotel {
    public String namaHotel;
    public String harga;
    public String tipebed;
    public String kipas;
    public String tempatboking;
    public int foto;

    public hotel(String namaHotel, String harga, String tipebed,String kipas,String tempatboking, int foto )
    {
        this.namaHotel = namaHotel;
        this.harga = harga;
        this.tipebed = tipebed;
        this.kipas = kipas;
        this.tempatboking = tempatboking;
        this.foto = foto;
    }
}

