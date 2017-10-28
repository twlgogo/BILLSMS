package com.ttwl.billsms;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by tanweiliang on 2017/10/28.
 */

public class DataAccessor {
    private DataBaseHelper dataBaseHelper;
    public DataAccessor(Context context){
         dataBaseHelper = new DataBaseHelper(context,"User.db",null,1);
    }
    public Cursor getAllGroups(){
        SQLiteDatabase database = dataBaseHelper.getReadableDatabase();
        String[] columns = new String[]{"groupname"};
        Cursor cursor = database.query("groups",columns,null,null,null,null,null);
        return cursor;
    }

    public Cursor getUsersbyGroup(String gid){
        SQLiteDatabase database = dataBaseHelper.getReadableDatabase();
        String[] cloumns = new  String[]{"username","phonenum"};
        String[] selectionArgs = new  String[]{gid};
        Cursor cursor = database.query("users",cloumns,"groupid=?",selectionArgs,null,null,null);
        return cursor;
    }

    public User resolveUserCursor(Cursor cursor){
        User res = new User();

        res.setUsername(cursor.getString(0));
        res.setPhonenum(cursor.getString(1));

        return res;

    }

    public Group resolveGroupCursor(Cursor cursor){
        Group  res = new Group();

        res.setGroupname(cursor.getString(0));

        return res;
    }


    }
