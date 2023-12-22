package com.example.cn1404;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CakeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake); // Thay thế bằng layout của bạn

        // Thêm dữ liệu cho các loại bánh
        cakeList.add(new CakeInfo(
                "BÁNH CUPCAKE",
                "Nguyên liệu: bột mì, đường, trứng...",
                "Hướng dẫn: Bước 1, bước 2..."
        ));
        cakeList.add(new CakeInfo(
                "BÁNH SU KEM",
                "Nguyên liệu: kem, sữa, đường...",
                "Hướng dẫn: Bắt đầu từ bước này..."
        ));
        // Thêm các loại bánh khác tương tự vào danh sách

        // Tham chiếu đến các button trong layout
        AppCompatButton btnCupcake = findViewById(R.id.Banhcupcake);
        AppCompatButton btnSuKem = findViewById(R.id.SuKem);
        // Tham chiếu tới các button khác tương tự

        // Thiết lập dữ liệu từ danh sách cho mỗi button
        btnCupcake.setText(cakeList.get(0).getName());
        btnSuKem.setText(cakeList.get(1).getName());
        // Đặt dữ liệu cho các button khác tương tự

        // Thiết lập sự kiện khi nhấn vào button
        btnCupcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị thông tin của BÁNH CUPCAKE trong một cửa sổ hoặc Dialog
                displayCakeInfo(cakeList.get(0));
            }
        });

        // Tương tự, thiết lập sự kiện cho các button khác
    }

    // Phương thức để hiển thị thông tin chi tiết của loại bánh
    private void displayCakeInfo(CakeInfo cake) {
        // Tạo một cửa sổ hoặc Dialog để hiển thị thông tin của bánh
        // Ví dụ: sử dụng AlertDialog để hiển thị thông tin công thức và nguyên liệu
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(cake.getName());
        builder.setMessage("Nguyên liệu: " + cake.getIngredients() + "\n\nHướng dẫn: " + cake.getInstructions());
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}