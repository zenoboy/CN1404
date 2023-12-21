package com.example.cn1404;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "FoodDB";
    private static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "FoodItems";
    static final String COLUMN_ID = "id";
    static final String COLUMN_FOOD_NAME = "Food_name";
    static final String COLUMN_INTRODUCT = "introduct";
    static final String COLUMN_INGREDIENT = "ingredient";
    static final String COLUMN_PERFORM = "perform";
    static final String COLUMN_IMAGE = "image";
    private Context context;

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_FOOD_NAME + " TEXT,"
                + COLUMN_INTRODUCT + " TEXT,"
                + COLUMN_INGREDIENT + " TEXT,"
                + COLUMN_PERFORM + " TEXT,"
                + COLUMN_IMAGE + " BLOB" + ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }



    long addFoodItem(String foodName, String introduct, String ingredient, String perform, byte[] image) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_FOOD_NAME, foodName);
        values.put(COLUMN_INTRODUCT, introduct);
        values.put(COLUMN_INGREDIENT, ingredient);
        values.put(COLUMN_PERFORM, perform);
        values.put(COLUMN_IMAGE, image);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.anngon);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] imageBytes = stream.toByteArray();
        long result = db.insert(TABLE_NAME, null, values);
        db.close();
        return result;
    }

    int updateFoodItem(int id, String foodName, String introduct, String ingredient, String perform) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_FOOD_NAME, foodName);
        values.put(COLUMN_INTRODUCT, introduct);
        values.put(COLUMN_INGREDIENT, ingredient);
        values.put(COLUMN_PERFORM, perform);
        int result = db.update(TABLE_NAME, values, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
        return result;
    }

    void deleteFoodItem(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
    }

    Cursor getAllFoodItems() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_NAME, null, null, null, null, null, null);
    }

    Cursor searchFoodByName(String searchText) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_NAME, null, COLUMN_FOOD_NAME + " LIKE ?",
                new String[]{"%" + searchText + "%"}, null, null, null);
    }
}

