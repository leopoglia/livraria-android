package com.example.livraria_android;


import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Livro extends AppCompatActivity {

    String nome;
    String sinopse;
    String editora;
    int ano;
    int foto;

    ImageView imageView;
    TextView nomeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView = findViewById(R.id.imageView);
        nomeView = findViewById(R.id.textView);

        System.out.println("FOTO --> " + foto);

        imageView.setImageResource(R.drawable.elon1);
        System.out.println("NOME -------> " + this.getNome());
        nomeView.setText(this.getNome());
    }


    public Livro(){

    }

    public Livro(String nome, String sinopse,
                 String editora, int ano, int foto){
        this.nome = nome;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.foto = foto;
    }

    public Livro(String nome, int foto){
        this.nome = nome;
        this.foto = foto;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
