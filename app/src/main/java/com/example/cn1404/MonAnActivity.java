package com.example.cn1404;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MonAnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        // Ánh xạ các view trong layout
        TextView textViewTenMonAn = findViewById(R.id.textViewTenMonAn);
        TextView textViewGioiThieu = findViewById(R.id.textViewGioiThieu);
        TextView textViewNguyenLieu = findViewById(R.id.textViewNguyenLieu);
        TextView textViewThucHien = findViewById(R.id.textViewThucHien);
        ImageView imageViewMonAn = findViewById(R.id.imageViewMonAn);
        ScrollView scrollView = findViewById(R.id.scrollView);

        // Nhận dữ liệu từ Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tenMonAn = extras.getString("tenMonAn");
            String gioiThieu = extras.getString("gioiThieu");
            String nguyenLieu = extras.getString("nguyenLieu");
            String thucHien = extras.getString("thucHien");
            int hinhAnh = extras.getInt("hinhAnh");

            // Hiển thị dữ liệu trong các TextView và ImageView
            textViewTenMonAn.setText(tenMonAn);
            textViewGioiThieu.setText(gioiThieu);
            textViewNguyenLieu.setText(nguyenLieu);
            textViewThucHien.setText(thucHien);
            imageViewMonAn.setImageResource(hinhAnh);

            // Chuyển đến vị trí mô tả của ScrollView
            scrollView.smoothScrollTo(0, textViewGioiThieu.getTop());
        }

        // Xử lý sự kiện khi nút "Quay lại" được nhấn
        Button buttonQuayLai = findViewById(R.id.buttonQuayLai);
        buttonQuayLai.setOnClickListener(view -> finish());
    }
}