package com.example.livraria_android;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView fotoView;
    TextView nomeView;
    ConstraintLayout constraintLayout;
    Button button;
    TextView sinopse;
    TextView editora;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        fotoView = itemView.findViewById(R.id.imageview);
        nomeView = itemView.findViewById(R.id.name);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        button = itemView.findViewById(R.id.button);
        sinopse = itemView.findViewById(R.id.sinopseView);
        editora = itemView.findViewById(R.id.editoraView);


    }


}
