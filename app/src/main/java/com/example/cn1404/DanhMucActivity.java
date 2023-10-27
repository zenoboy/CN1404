package com.example.cn1404;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import java.util.List;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DanhMucActivity  extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> itemList;
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
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });
        Button btnBanhNgot = findViewById(R.id.BanhNgot);
        btnBanhNgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Bánh Ngọt", true);
            }
        });

        Button btnXoi = findViewById(R.id.Xoi);
        btnXoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Xôi Chè", true);
            }
        });
        Button btnOc = findViewById(R.id.Oc);
        btnOc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Ốc", true);
            }
        });
        Button btnDoChay = findViewById(R.id.DoChay);
        btnDoChay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Đồ Chay", true);
            }
        });
        Button btnHaisan = findViewById(R.id.Haisan);
        btnHaisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Hải Sản", true);
            }
        });
        Button btnMonnhau = findViewById(R.id.Monnhau);
        btnMonnhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Nhậu", true);
            }
        });
        Button btnKem = findViewById(R.id.Kem);
        btnKem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Kem", true);
            }
        });
        Button btnNuongLau = findViewById(R.id.NuongLau);
        btnOc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Nướng Lẩu", true);
            }
        });
        Button btnBunMien = findViewById(R.id.BunMien);
        btnBunMien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Bún Miến", true);
            }
        });
        Button btnThitVit = findViewById(R.id.ThitVit);
        btnThitVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Thịt Vịt", true);
            }
        });
        Button btnThitBo = findViewById(R.id.ThitBo);
        btnThitBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Thịt Bò", true);
            }
        });
        Button btnThitHeo = findViewById(R.id.ThitHeo);
        btnThitHeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Thịt Heo", true);
            }
        });
        Button btnThitGa = findViewById(R.id.ThitGa);
        btnThitGa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Thịt Gà", true);
            }
        });
        Button btnMonHan = findViewById(R.id.Han);
        btnMonHan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Hàn", true);
            }
        });
        Button btnMonNhat = findViewById(R.id.Nhat);
        btnMonNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Nhật", true);
            }
        });
        Button btnMonTrung = findViewById(R.id.Trung);
        btnMonTrung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Trung", true);
            }
        });
        Button btnMonAuMy = findViewById(R.id.AuMy);
        btnMonAuMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Âu Mỹ", true);
            }
        });
        Button btnMonViet = findViewById(R.id.Viet);
        btnMonViet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery("Món Việt", true);
            }
        });
}
    private void filter(String text) {
        List<String> filteredList = new ArrayList<>();

        for (String item : itemList) {
            if (item.toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        adapter.clear();
        adapter.addAll(filteredList);
        adapter.notifyDataSetChanged();
    }
}
