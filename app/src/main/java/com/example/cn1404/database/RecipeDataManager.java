package com.example.cn1404.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class RecipeDataManager {

    private SQLiteDatabase database;
    private RecipeDatabaseHelper dbHelper;

    public RecipeDataManager(Context context) {
        dbHelper = new RecipeDatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertRecipe(String name, String ingredients, String instructions) {
        ContentValues values = new ContentValues();
        values.put(RecipeDatabaseHelper.COLUMN_NAME, name);
        values.put(RecipeDatabaseHelper.COLUMN_INGREDIENTS, ingredients);
        values.put(RecipeDatabaseHelper.COLUMN_INSTRUCTIONS, instructions);

        return database.insert(RecipeDatabaseHelper.TABLE_RECIPES, null, values);
    }

    public Cursor getAllRecipes() {
        return database.query(
                RecipeDatabaseHelper.TABLE_RECIPES,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }
}

