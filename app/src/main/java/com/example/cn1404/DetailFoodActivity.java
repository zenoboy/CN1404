package com.example.cn1404;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.BitmapFactory;


import androidx.appcompat.app.AppCompatActivity;

public class DetailFoodActivity extends AppCompatActivity {

    private TextView foodNameTextView, introductTextView, ingredientTextView, performTextView;
    private ImageView foodImageView;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        databaseHelper = new DatabaseHelper(this);


        foodNameTextView = findViewById(R.id.textViewTenMonAn);
        introductTextView = findViewById(R.id.textViewGioiThieu);
        ingredientTextView = findViewById(R.id.textViewNguyenLieu);
        performTextView = findViewById(R.id.textViewThucHien);
        foodImageView = findViewById(R.id.imageViewMonAn);


        int id = getIntent().getIntExtra("FoodDB", -1);


        if (id != -1) {
            Cursor cursor = databaseHelper.getReadableDatabase().rawQuery(
                    "SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COLUMN_ID + " = " + id, null);

            if (cursor.moveToFirst()) {
                int foodNameIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_FOOD_NAME);
                int introductIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_INTRODUCT);
                int ingredientIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_INGREDIENT);
                int performIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_PERFORM);
                int imageIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_IMAGE);

                if (foodNameIndex >= 0) {
                    String foodName = cursor.getString(foodNameIndex);
                    foodNameTextView.setText(foodName);
                }

                if (introductIndex >= 0) {
                    String introduct = cursor.getString(introductIndex);
                    introductTextView.setText(introduct);
                }

                if (ingredientIndex >= 0) {
                    String ingredient = cursor.getString(ingredientIndex);
                    ingredientTextView.setText(ingredient);
                }

                if (performIndex >= 0) {
                    String perform = cursor.getString(performIndex);
                    performTextView.setText(perform);
                }

                if (imageIndex >= 0) {
                    byte[] imageBytes = cursor.getBlob(imageIndex);
                    foodImageView.setImageBitmap(BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length));
                }
            }

            cursor.close();
        }
    }
}