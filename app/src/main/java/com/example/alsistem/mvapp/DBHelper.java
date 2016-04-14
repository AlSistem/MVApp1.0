package com.example.alsistem.mvapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usuario MV on 13/04/2016.
 */
public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_Name = "ResMV";
    private static final int DB_SCHEME_VERCION = 1;

    public DBHelper(Context context) {
        super(context, DB_Name, null, DB_SCHEME_VERCION);
    }

    public void onCreate(SQLiteDatabase db){

    }

    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
