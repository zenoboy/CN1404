package com.example.cn1404;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Kích hoạt chức năng tìm kiếm
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Xử lý khi người dùng nhấn nút tìm kiếm
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Xử lý khi người dùng thay đổi văn bản tìm kiếm
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            // Xử lý khi biểu tượng tìm kiếm được nhấn
            return true;
        }
        if (id == R.id.action_keypad) {

            // Xử lý khi biểu tượng "keypad" được nhấn
//            AlertDialog.Builder alerDialog= new AlertDialog.Builder(HomeActivity.this);
//            View DialogView = LayoutInflater.from(HomeActivity.this).inflate(R.layout.danhmucdoan,null);
//            alerDialog.setView(DialogView);
            setContentView(R.layout.danhmucdoan);

            return true;
        }

        // Xử lý các mục menu khác nếu cần

        return super.onOptionsItemSelected(item);

    }







}