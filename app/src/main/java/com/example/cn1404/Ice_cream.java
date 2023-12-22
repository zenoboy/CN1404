package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ice_cream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream);

        // Tìm kiếm nút "kemchuoi" theo ID
        Button kemChuoiButton = findViewById(R.id.kemchuoi);

        // Đặt lắng nghe sự kiện khi nút "kemchuoi" được nhấn
        kemChuoiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy công thức cách làm cho kem chuối (thay thế bằng công thức thực tế)
                String recipeInstructions = "Bước 1: Chuẩn bị chuối\nBước 2: Làm kem";

                // Mở Activity mới để hiển thị công thức
                Intent intent = new Intent(Ice_cream.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
    }
}