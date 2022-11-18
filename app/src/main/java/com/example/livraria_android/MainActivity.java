package com.example.livraria_android;

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
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);



        List<Livro> items = new ArrayList<Livro>();
        items.add(new Livro("Pequeno Principe", R.drawable.pequeno));
        items.add(new Livro("Pequeno Principe", R.drawable.pequeno));
        items.add(new Livro("Pequeno Principe", R.drawable.pequeno));
        items.add(new Livro("Pequeno Principe", R.drawable.pequeno));
        items.add(new Livro("Pequeno Principe", R.drawable.pequeno));


        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));



        FloatingActionButton criar = findViewById(R.id.floatingActionButton9);

        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CriarLivroActivity.class);
                startActivity(it);
            }
        });
    }
}