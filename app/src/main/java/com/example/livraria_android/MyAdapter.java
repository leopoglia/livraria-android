package com.example.livraria_android;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener{

    Context Context;
    List<Livro> items;

    public MyAdapter(Context context, List<Livro> items) {
        Context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(Context).inflate(R.layout.item_view, parent, false);
        Context = itemLista.getContext();
        itemLista.setOnClickListener(this);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nomeView.setText(items.get(position).getNome());
        holder.fotoView.setImageResource(items.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onClick(View v) {
        Context.startActivity(new Intent(Context, Livro.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}
