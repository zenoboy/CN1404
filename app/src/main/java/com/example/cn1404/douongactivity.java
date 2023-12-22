package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class douongactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_douongactivity);

        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(douongactivity.this, HomeActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonphache = findViewById(R.id.PhaChe);

        buttonphache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(douongactivity.this, Do_Uong_Pha_CheActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button buttonsinhto = findViewById(R.id.SinhTo);

        buttonsinhto.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(douongactivity.this, Sinh_To_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
    }

}
