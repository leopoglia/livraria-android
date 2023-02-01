package com.example.livraria_android;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView fotoView;
    TextView nomeView;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        fotoView = itemView.findViewById(R.id.imageview);
        nomeView = itemView.findViewById(R.id.name);
    }


}
