package com.example.livraria_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CriarLivroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_livro);


        Button criar = findViewById(R.id.button2);

        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CriarLivroActivity.this, AdicionarImagem.class);
                startActivity(it);
            }
        });

        FloatingActionButton voltar = findViewById(R.id.floatingActionButton2);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CriarLivroActivity.this, MainActivity.class);
                startActivity(it);
            }
        });


        EditText nome = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText sinopse = (EditText)findViewById(R.id.editTextTextPersonName4);
        EditText editora = (EditText)findViewById(R.id.editTextTextPersonName5);
        EditText ano = (EditText)findViewById(R.id.editTextTextPersonName6);

        Button cadastrar = findViewById(R.id.button3);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("nome ->" + nome.getText().toString());
                System.out.println("sinopse ->" + sinopse.getText().toString());
                System.out.println("editora ->" + editora.getText().toString());
                System.out.println("ano ->" + ano.getText().toString());

            }
        });


    }
}
