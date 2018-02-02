package com.example.hyeryeongsong.my_application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HyeRyeongSong on 2018. 2. 2..
 */

public class DBOpenHelper extends SQLiteOpenHelper
{

    public DBOpenHelper(Context context, String name,
                        SQLiteDatabase.CursorFactory factory, int version) {
        super(context,name,factory,version);
    }

    @Override
    public  void onCreate(SQLiteDatabase db) {
        String sql = "create table color (" +
                "id integer, " +
                "red integer, " +
                "green integer, " +
                "blue integer);";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "drop table if exists color";
        db.execSQL(sql);

        onCreate(db);
    }
}

