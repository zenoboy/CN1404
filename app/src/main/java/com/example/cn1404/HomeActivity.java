package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;



public class HomeActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        // Khai báo Toolbar và kết nối nó với ID đã đặt trong tệp XML
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Tiêu đề của ActionBar");
//
//
//    };
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Tiêu đề của ActionBar");
//
//    }
  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);

//        // Tìm kiếm
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) searchItem.getActionView();
//
//        // Thiết lập lắng nghe cho sự kiện tìm kiếm
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                // Xử lý khi người dùng nhấn nút tìm kiếm
//                return true;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                // Xử lý khi người dùng thay đổi văn bản trong ô tìm kiếm
//                return true;
//            }

        return true;
    }


}
