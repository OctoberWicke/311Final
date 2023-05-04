package com.example.theapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DatabaseControl {

    // update this to work with the new information changed in Helper

    SQLiteDatabase database;
    DatabaseHelper helper;

    public DatabaseControl(Context context){
        helper = new DatabaseHelper(context);
    }

    public void open(){
        database = helper.getWritableDatabase();
    }

    public void close(){
        helper.close();
    }

    //name = Username, state = Password
    public boolean insert(String Username, String Password){
        ContentValues values = new ContentValues();
        values.put("Username", Username);
        values.put("Password", Password);
        return database.insert("contact", null, values) > 0;
    }

    public void delete(String n){
        database.delete("contact", "name =\"" + n + "\"", null);
    }

    public String attemptSignIn(String Username){
        String query = "select Password from contact where Username =\"" + Username + "\"";
        Cursor cursor = database.rawQuery(query, null);
        cursor.moveToFirst();
        String Password = cursor.getString(0);
        cursor.close();
        return Password;
    }


}
