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
    int posicao;
    String fotonsio;

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
        setFoto(String.valueOf(items.get(position).foto));

        setPosicao(position);
        System.out.println("POSIIIIIIIIIIIIIIIIITION --->" + position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setFoto(String foto) {
        this.fotonsio = foto;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Context, Livro.class);


        intent.putExtra("nome", items.get(posicao).getNome());
        intent.putExtra("foto", fotonsio);
        intent.putExtra("sinopse", items.get(posicao).getSinopse());
        intent.putExtra("editora", items.get(posicao).getEditora());
        intent.putExtra("ano", items.get(posicao).getAno());


        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Context.startActivity(intent);
    }

}
