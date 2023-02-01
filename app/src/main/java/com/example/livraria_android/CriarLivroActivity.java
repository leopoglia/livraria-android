package com.example.livraria_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CriarLivroActivity extends AppCompatActivity {

    static String valueImageme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_livro);


        Button criar = findViewById(R.id.button2);

        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CriarLivroActivity.this, AdicionarImagem.class);
                it.putExtra("key","Hello World");

                startActivity(it);
            }
        });

        FloatingActionButton voltar = findViewById(R.id.floatingActionButton2);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });


        EditText nome = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText sinopse = (EditText)findViewById(R.id.editTextTextPersonName4);
        EditText editora = (EditText)findViewById(R.id.editTextTextPersonName5);
        EditText ano = (EditText)findViewById(R.id.editTextTextPersonName6);

        Button cadastrar = findViewById(R.id.button3);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String livro = nome.getText().toString() + ";" + sinopse.getText().toString() + ";" +  editora.getText().toString() + ";" +  Integer.parseInt(ano.getText().toString()) + ";" +  valueImageme;
                System.out.println(livro);

                Intent i = new Intent(CriarLivroActivity.this, MainActivity.class);
                i.putExtra("livro", livro);
                startActivity(i);
            }
        });



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String valueImagem = extras.getString("key");
            valueImageme = valueImagem;
        }
    }
}
