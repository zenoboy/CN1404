package com.example.cn1404;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DanhMucActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private DatabaseHelper dbHelper;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danhmucdoan);

        dbHelper = new DatabaseHelper(this);
        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchView);

        ImageButton backButton = findViewById(R.id.imageButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        loadAllFoodItems();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFood = (String) parent.getItemAtPosition(position);
                Toast.makeText(DanhMucActivity.this, "Selected food: " + selectedFood, Toast.LENGTH_SHORT).show();
                // You can add further actions for the selected item here
            }
        });


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchFood(newText);
                return true;
            }
        });
    }


    private void loadAllFoodItems() {
        Cursor cursor = dbHelper.getAllFoodItems();
        ArrayList<String> foodList = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                String foodName = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_FOOD_NAME));
                foodList.add(foodName);
            } while (cursor.moveToNext());
        }
        cursor.close();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foodList);
        listView.setAdapter(adapter);
    }


    private void searchFood(String searchText) {
        Cursor searchCursor = dbHelper.searchFoodByName(searchText);
        ArrayList<String> searchList = new ArrayList<>();
        if (searchCursor.moveToFirst()) {
            do {
                String foodName = searchCursor.getString(searchCursor.getColumnIndex(DatabaseHelper.COLUMN_FOOD_NAME));
                searchList.add(foodName);
            } while (searchCursor.moveToNext());
        }
        searchCursor.close();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, searchList);
        listView.setAdapter(adapter);
    }
}

