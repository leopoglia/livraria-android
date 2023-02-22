package com.example.livraria_android;


import android.content.Intent;
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
    TextView sinopseView;
    TextView editoraView;
    TextView anoView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String fotona = intent.getStringExtra("foto");
        String sinopse = intent.getStringExtra("sinopse");
        String editora = intent.getStringExtra("editora");
        Integer ano = intent.getIntExtra("ano", 0);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView = findViewById(R.id.imageView);
        nomeView = findViewById(R.id.textView);
        sinopseView = findViewById(R.id.sinopseView);
        editoraView = findViewById(R.id.editoraView);
        anoView = findViewById(R.id.anoView);


//        if(foto == )
        imageView.setImageResource(Integer.parseInt(fotona));
        nomeView.setText("Nome: " + nome);
        sinopseView.setText("Sinopse: " + sinopse);
        editoraView.setText("Editora: " + editora);
        anoView.setText("Ano: " + ano);

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
