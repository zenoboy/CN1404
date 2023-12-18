package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YeuthichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeuthich);

        Button buttonQuayLai = findViewById(R.id.buttonQuayLai);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                // Tạo Intent để chuyển đến HomeActivity
                Intent intent = new Intent(YeuthichActivity.this, HomeActivity.class);

                // Đặt cờ để xóa khỏi ngăn đợi (back stack) và tạo ra HomeActivity như là một trang mới
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Khởi chạy Intent
                startActivity(intent);
            }
        });
    }

}