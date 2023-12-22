package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trang_MiengActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_mieng);


        Button buttonquaylai = findViewById(R.id.back);
        buttonquaylai.setOnClickListener(new  View.OnClickListener()
        {
        public void  onClick(View view){
            Intent intent = new Intent(Trang_MiengActivity.this, HomeActivity.class);
            startActivity(intent);        }

        });


        Button buttonbanhngot= findViewById(R.id.BanhNgot);
        buttonbanhngot.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Trang_MiengActivity.this, Cake_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonKem = findViewById(R.id.Kem);

        buttonKem.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Trang_MiengActivity.this, Ice_cream.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
    }
}