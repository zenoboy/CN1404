package com.example.cn1404;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cn1404.database.RecipeDataManager;

import java.util.ArrayList;
import java.util.List;

public class RecipeListActivity extends AppCompatActivity {

    private RecipeDataManager recipeDataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        ListView listView = findViewById(R.id.listView);
        recipeDataManager = new RecipeDataManager(this);
        recipeDataManager.open();

        addExampleData();

        displayRecipes(listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
    }

    private void addExampleData() {
        recipeDataManager.insertRecipe("Kem Vanilla", "Sữa, đường, vani", "1. Trộn sữa và đường\n2. Thêm vani\n3. Đun sôi và đông lạnh");
        recipeDataManager.insertRecipe("Kem Chocolate", "Sữa, đường, cacao", "1. Trộn sữa và đường\n2. Thêm cacao\n3. Đun sôi và đông lạnh");
    }

    private void displayRecipes(ListView listView) {
        List<String> recipeList = new ArrayList<>();



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipeList);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        recipeDataManager.close();
    }
}
