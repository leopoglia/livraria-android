package com.example.livraria_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AdicionarImagem extends AppCompatActivity {
    static String radioEscolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_imagem);



        RadioButton radioButton1 = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 = findViewById(R.id.radioButton3);
        ImageView imagemTrocar = findViewById(R.id.imageView2);
        RadioGroup grupoRadio = findViewById(R.id.radioGroup);


        FloatingActionButton criar = findViewById(R.id.floatingActionButton);
        criar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(AdicionarImagem.this, CriarLivroActivity.class);
                startActivity(it);
            }
        });

        grupoRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        imagemTrocar.setImageResource(R.drawable.elon3);
                        radioEscolhido = "3";
                        break;
                    case R.id.radioButton2:
                        imagemTrocar.setImageResource(R.drawable.elon1);
                        radioEscolhido = "1";
                        break;
                    case R.id.radioButton3:
                        imagemTrocar.setImageResource(R.drawable.elon2);
                        radioEscolhido = "2";
                        break;
                }
            }
        });

        Button adicionarImagem = findViewById(R.id.button5);
        adicionarImagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdicionarImagem.this, CriarLivroActivity.class);
                i.putExtra("key", radioEscolhido);
                startActivity(i);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");

            System.out.println(value);
        }
    }


}
