package com.example.livraria_android;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<Livro> items = new ArrayList<Livro>();


    public MainActivity(){
        if(items.size() == 0) {
            items.add(new Livro("Pequeno Principe", "1", "123", 2022, R.drawable.elon1));
            items.add(new Livro("Pequeno Principe", "2", "123", 2023, R.drawable.elon1));
            items.add(new Livro("Pequeno Principe", "3", "123", 2024, R.drawable.elon1));
            items.add(new Livro("Pequeno Principe", "4", "123", 2025, R.drawable.elon1));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));



        FloatingActionButton criar = findViewById(R.id.floatingActionButton9);

        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CriarLivroActivity.class);
                startActivity(it);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String itemNovo = extras.getString("livro");

            String[] textoSeparado = itemNovo.split(";");
            Integer imagem = parseInt(textoSeparado[4]);

            if(imagem == 1){
                items.add(new Livro(textoSeparado[0], textoSeparado[1], textoSeparado[2], parseInt(textoSeparado[3]), R.drawable.elon1));
                System.out.println("ENTROU 1");
            }else if(imagem == 2){
                items.add(new Livro(textoSeparado[0], textoSeparado[1], textoSeparado[2], parseInt(textoSeparado[3]), R.drawable.elon2));
                System.out.println("ENTROU 2");
            }else if(imagem == 3){
                items.add(new Livro(textoSeparado[0], textoSeparado[1], textoSeparado[2], parseInt(textoSeparado[3]), R.drawable.elon3));
                System.out.println("ENTROU 3");
            }
        }

    }
}