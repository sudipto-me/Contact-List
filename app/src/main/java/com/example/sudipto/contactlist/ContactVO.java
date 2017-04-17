package com.example.sudipto.contactlist;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

/**
 * Created by sudipto on 3/31/2017.
 */

public class ContactVO {

     public String ContactName;
    public String ContactNumber;

    public ContactVO(String name, String phoneNum) {
        this.ContactName = name;
        this.ContactNumber = phoneNum;
    }




}
