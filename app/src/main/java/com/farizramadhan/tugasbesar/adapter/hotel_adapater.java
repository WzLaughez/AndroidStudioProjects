package com.farizramadhan.tugasbesar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.farizramadhan.tugasbesar.R;
import com.farizramadhan.tugasbesar.model.hotel;

import java.util.List;

public class hotel_adapater extends RecyclerView.Adapter<hotel_adapater.hotelholder> {
    //variabel global untuk adapter
    public List<hotel> hotelList;
    public LayoutInflater lay;
    public Context ctx;

    public class hotelholder extends RecyclerView.ViewHolder{
        TextView namahotel;
        TextView harga;
        TextView tipe;
        TextView kipas;
        TextView boking;
        ImageView foto;

        public hotelholder(View itemview){
            super(itemview);
            this.namahotel = itemview.findViewById(R.id.namahotel);
            this.harga = itemview.findViewById(R.id.harga);
            this.tipe = itemview.findViewById(R.id.tipebed);
            this.kipas = itemview.findViewById(R.id.kipas);
            this.boking = itemview.findViewById(R.id.tempatboking);
            this.foto = itemview.findViewById(R.id.gambarhotel);
        }
    }

    @Override
    public int getItemCount() { return this.hotelList.size();}

    public hotel_adapater(List<hotel> list, Context context){
        this.hotelList = list;
        this.ctx = context;
        this.lay =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public hotelholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        //panggil layout "content hotel"
        View rootview = lay.inflate(R.layout.content_hotel,parent,false);
        return new hotelholder(rootview);
    }

    @Override
    public void onBindViewHolder(@NonNull hotelholder holder, int position)
    {
        final  hotel hotel = hotelList.get(position);
        holder.namahotel.setText(hotel.namaHotel);
        holder.harga.setText(hotel.harga);
        holder.tipe.setText(hotel.tipebed);
        holder.kipas.setText(hotel.kipas);

        holder.boking.setText(hotel.tempatboking);
        holder.foto.setImageDrawable(ctx.getResources().getDrawable(hotel.foto));
    }
}
