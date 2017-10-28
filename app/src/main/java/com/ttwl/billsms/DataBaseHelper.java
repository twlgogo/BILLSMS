package com.ttwl.billsms;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tanweiliang on 2017/10/28.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public final String CREATE_USERS = "create table users("
            +"uid integer primary key autoincrement, "
            +"username text, "
            +"groupid integer, "
            +"phonenum text)";
    public final String CREATE_GROUPS = "create table groups("
            +"gid integer primary key autoincrement, "
            +"groupname text, ";
    private Context mContext;
    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database){
        database.execSQL(CREATE_USERS);
        database.execSQL(CREATE_GROUPS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database,int oldVersion,int newVersion){
        database.execSQL("drop table if exists users");
        database.execSQL("drop table if exists groups");
    }


}
