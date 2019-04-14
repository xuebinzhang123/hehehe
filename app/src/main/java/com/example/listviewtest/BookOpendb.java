package com.example.listviewtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BookOpendb extends SQLiteOpenHelper {
    public static final String CREATE_BOOK="create table book("
            +"id integer primary key autoincrement,"
            +"author text,"
            +"pages integer,"
            +"name text,"
            +"image integer)";

    Context mContext;
    public BookOpendb(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext=context;
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK);

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists book");
        onCreate(db);
    }
}
