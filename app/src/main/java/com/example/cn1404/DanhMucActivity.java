package com.example.cn1404;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DanhMucActivity extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danhmucdoan);

        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();
        itemList.add("Bánh Ngọt");
        itemList.add("Xôi Chè");
        itemList.add("Ốc");
        itemList.add("Đồ Chay");
        itemList.add("Hải Sản");
        itemList.add("Món Nhậu");
        itemList.add("Kem");
        itemList.add("Nướng Lẩu");
        itemList.add("Bún Miến");
        itemList.add("Thịt Vịt");
        itemList.add("Thịt Bò");
        itemList.add("Thịt Heo");
        itemList.add("Thịt Cá");
        itemList.add("Món Hàn");
        itemList.add("Món Nhật");
        itemList.add("Món Trung");
        itemList.add("Món Âu Mỹ");
        itemList.add("Món Việt");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFood = itemList.get(position);
                Toast.makeText(DanhMucActivity.this, "Bạn đã chọn: " + selectedFood, Toast.LENGTH_SHORT).show();
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}