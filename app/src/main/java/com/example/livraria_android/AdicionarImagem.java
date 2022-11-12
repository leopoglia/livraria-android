package com.example.livraria_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AdicionarImagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_imagem);


        FloatingActionButton criar = findViewById(R.id.floatingActionButton);

        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(AdicionarImagem.this, CriarLivroActivity.class);
                startActivity(it);
            }
        });
    }


}
