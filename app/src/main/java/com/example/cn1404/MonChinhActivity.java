package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonChinhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_chinh);
        Button buttonquaylai = findViewById(R.id.back);
        buttonquaylai.setOnClickListener(new  View.OnClickListener()
        {
            public void onClick(View view){
                Intent intent= new Intent(MonChinhActivity.this,HomeActivity.class);
                startActivity(intent);
        }
        });
        Button buttonmonga = findViewById(R.id.MonGa);
        buttonmonga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonChinhActivity.this, Mon_Ga_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonmonbo = findViewById(R.id.MonBo);
        buttonmonbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonChinhActivity.this, Mon_Bo_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonmonca = findViewById(R.id.MonCa);
        buttonmonca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonChinhActivity.this, Mon_Ca_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
}
}