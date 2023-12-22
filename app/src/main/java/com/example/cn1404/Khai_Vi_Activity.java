package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khai_Vi_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khai_vi);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Khai_Vi_Activity.this, HomeActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonMonsup = findViewById(R.id.MonSup);

        buttonMonsup.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Khai_Vi_Activity.this, Mon_Sup_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonsalad = findViewById(R.id.Salad);

        buttonsalad.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Khai_Vi_Activity.this, Salad_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
    }
    }
