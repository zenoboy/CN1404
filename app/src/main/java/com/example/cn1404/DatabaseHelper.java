package com.example.cn1404;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "FoodDB";
    private static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "FoodItems";

    static final String COLUMN_ID = "id";
    static final String COLUMN_FOOD_NAME = "Food_name";
    static final String COLUMN_INTRODUCT = "introduct";
    static final String COLUMN_INGREDIENT = "ingredient";
    static final String COLUMN_PERFORM = "perform";

    // Các cột mới cho bảng Favourites
    static final String TABLE_FAVOURITES = "Favourites";
    static final String FAVOURITES_ID = "id";
    static final String FAVOURITES_NAME = "name";
    static final String FAVOURITES_CATEGORY = "category";
    static final String FAVOURITES_GLASS = "glass";
    static final String FAVOURITES_INSTRUCTIONS = "instructions";
    static final String FAVOURITES_INGREDIENTS = "ingredients";
    static final String FAVOURITES_THUMBNAIL_URL = "thumbnail_url";
    static final String FAVOURITES_ADDED_AT = "added_at";

    @SuppressLint("SimpleDateFormat")
    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_FOOD_NAME + " TEXT,"
                + COLUMN_INTRODUCT + " TEXT,"
                + COLUMN_INGREDIENT + " TEXT,"
                + COLUMN_PERFORM + " TEXT" + ")";
        db.execSQL(CREATE_TABLE);

        String CREATE_FAVOURITES_TABLE = "CREATE TABLE " + TABLE_FAVOURITES + "("
                + FAVOURITES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + FAVOURITES_NAME + " VARCHAR(50) NOT NULL,"
                + FAVOURITES_CATEGORY + " VARCHAR(50) NOT NULL,"
                + FAVOURITES_GLASS + " VARCHAR(50) NOT NULL,"
                + FAVOURITES_INSTRUCTIONS + " LONGTEXT NOT NULL,"
                + FAVOURITES_INGREDIENTS + " LONGTEXT NOT NULL,"
                + FAVOURITES_THUMBNAIL_URL + " VARCHAR(50) NOT NULL,"
                + FAVOURITES_ADDED_AT + " DATE NOT NULL"
                + ")";
        db.execSQL(CREATE_FAVOURITES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVOURITES);
        onCreate(db);
    }

    long addFoodItem(String foodName, String introduct, String ingredient, String perform) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_FOOD_NAME, foodName);
        values.put(COLUMN_INTRODUCT, introduct);
        values.put(COLUMN_INGREDIENT, ingredient);
        values.put(COLUMN_PERFORM, perform);
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

    /**
     * Adds a drink to the favorites database
     *
     * @param id            drink id
     * @param name          drink name
     * @param category      drink category
     * @param glass         preferred glass
     * @param instructions  drink preparation instructions
     * @param ingredients   drink ingredients
     * @param thumbnail_url drink thumbnail url
     * @return number of rows inserted, -1 if no drink was inserted
     */
    public long addToFavourites(int id, String name, String category, String glass, String instructions, String ingredients, String thumbnail_url) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FAVOURITES_ID, id);
        values.put(FAVOURITES_NAME, name);
        values.put(FAVOURITES_CATEGORY, category);
        values.put(FAVOURITES_GLASS, glass);
        values.put(FAVOURITES_INSTRUCTIONS, instructions);
        values.put(FAVOURITES_INGREDIENTS, ingredients);
        values.put(FAVOURITES_THUMBNAIL_URL, thumbnail_url);
        values.put(FAVOURITES_ADDED_AT, formatter.format(new Date()));
        long affected = db.insert(TABLE_FAVOURITES, null, values);
        db.close();
        return affected;
    }

    /**
     * Deletes a drink from favorites
     *
     * @param id drink id
     * @return number of rows deleted, 0 if no drink was deleted
     */
    public int deleteFromFavourites(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int affected = db.delete(TABLE_FAVOURITES, FAVOURITES_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
        return affected;
    }
    /**
     * Return an ArrayList of HashMaps containing id, name, category, thumbnail url and added at
     * of drinks added as favourites.
     *
     * @return list with info of drinks
     */
    public ArrayList<HashMap<String, String>> getFavourites() {
        ArrayList<HashMap<String, String>> entries = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_FAVOURITES, new String[]{FAVOURITES_ID, FAVOURITES_NAME, FAVOURITES_CATEGORY, FAVOURITES_THUMBNAIL_URL, FAVOURITES_ADDED_AT}, null, null, null, null, FAVOURITES_ADDED_AT + " DESC");
        while (cursor.moveToNext()) {
            HashMap<String, String> entry = new HashMap<>();
            entry.put(FAVOURITES_ID, cursor.getString(cursor.getColumnIndexOrThrow(FAVOURITES_ID)));
            entry.put(FAVOURITES_NAME, cursor.getString(cursor.getColumnIndexOrThrow(FAVOURITES_NAME)));
            entry.put(FAVOURITES_CATEGORY, cursor.getString(cursor.getColumnIndexOrThrow(FAVOURITES_CATEGORY)));
            entry.put(FAVOURITES_THUMBNAIL_URL, cursor.getString(cursor.getColumnIndexOrThrow(FAVOURITES_THUMBNAIL_URL)));
            entry.put(FAVOURITES_ADDED_AT, cursor.getString(cursor.getColumnIndexOrThrow(FAVOURITES_ADDED_AT)));
            entries.add(entry);
        }
        cursor.close();
        db.close();
        return entries;
    }
}
