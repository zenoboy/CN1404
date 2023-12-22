package com.example.cn1404;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        TextView instructionsTextView = findViewById(R.id.instructionsTextView);

        String instructions = getIntent().getStringExtra("instructions");

        instructionsTextView.setText(instructions);
    }
}
