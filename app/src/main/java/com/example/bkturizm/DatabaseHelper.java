package com.example.bkturizm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context)
    {
        super(context,"Login.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("Create table user(name text,surname text,email text primary key,phone text,password text)");
        db.execSQL("INSERT INTO user(name, surname, email, phone, password ) VALUES ('Muhammed', 'Sevuk', 'admin', '05393692454', '123456')");
        db.execSQL("Create table tickets(nereden text,nereye text,timek text,timev text,price text)");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Ankara', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Ankara', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Ankara', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'İzmir', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'İzmir', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'İzmir', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kayseri', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kayseri', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kayseri', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Ankara', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Ankara', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Ankara', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İzmir', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İzmir', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İzmir', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Kayseri', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Kayseri', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Kayseri', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Antalya', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Antalya', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Antalya', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Bursa', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Bursa', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Bursa', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Edirne', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Edirne', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Edirne', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Antalya', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Antalya', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Antalya', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Bursa', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Bursa', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Bursa', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Edirne', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Edirne', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Edirne', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Muğla', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Muğla', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Muğla', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Adana', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Adana', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Adana', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kocaeli', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kocaeli', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Kocaeli', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Muğla', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Muğla', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Muğla', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Adana', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Adana', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Adana', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Kocaeli', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Kocaeli', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Kocaeli', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Adıyaman', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Adıyaman', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Adıyaman', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sinop', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sinop', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sinop', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Erzincan', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Erzincan', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Erzincan', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Adıyaman', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Adıyaman', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Adıyaman', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Sinop', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Sinop', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Sinop', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Erzincan', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Erzincan', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Erzincan', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Erzurum', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Erzurum', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Erzurum', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Malatya', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Malatya', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Malatya', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Urfa', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Urfa', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Urfa', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Malatya', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Malatya', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Malatya', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Erzurum', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Erzurum', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Erzurum', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Urfa', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Urfa', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Urfa', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Ordu', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Ordu', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Ordu', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sivas', '12:45', '19:50', '80')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sivas', '10:50', '17:50', '75')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Sivas', '17:15', '00:50', '150')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Giresun', '09:45', '19:50', '115')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Giresun', '12:35', '22:50', '125')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Giresun', '18:38', '04:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Ordu', 'İstanbul', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Ordu', 'İstanbul', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Ordu', 'İstanbul', '17:15', '22:50', '95')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Sivas', 'İstanbul', '10:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Sivas', 'İstanbul', '14:20', '17:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Sivas', 'İstanbul', '17:00', '22:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Giresun', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Giresun', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Giresun', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('Hatay', 'İstanbul', '11:00', '15:50', '180')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Hatay', 'İstanbul', '16:00', '23:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('Hatay', 'İstanbul', '19:20', '00:50', '70')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev, price ) VALUES ('İstanbul', 'Hatay', '10:50', '15:50', '100')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Hatay', '12:45', '17:50', '120')");
        db.execSQL("INSERT INTO tickets(nereden, nereye, timek, timev,price ) VALUES ('İstanbul', 'Hatay', '17:15', '22:50', '95')");
        db.execSQL("Create table userticket(email text,bilet text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion , int newVersion)
    {
        db.execSQL("drop table if exists user");
        db.execSQL("drop table if exists tickets");
        db.execSQL("drop table if exists userticket");

    }

    //insert

    public boolean insertUser(String name, String surname , String email, String phone,String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("surname",surname);
        cv.put("email",email);
        cv.put("phone",phone);
        cv.put("password",password);
        long ins = db.insert("user",null,cv);
        if(ins == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean cEmail(String email)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=?",new String[]{email});
        if(cursor.getCount() > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean emailpassword(String email, String password)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where email=? and password=?",new String[]{email,password});
        if(cursor.getCount() > 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<String> display(String sehir1,String sehir2)
    {
    List<String> veriler = new ArrayList<String>();
    SQLiteDatabase db = this.getReadableDatabase();
    try {
        Cursor cursor = db.rawQuery("SELECT * FROM tickets WHERE nereden ='" + sehir1 + "' AND nereye='" + sehir2 + "'",null);
        while(cursor.moveToNext())
        {
            veriler.add( "\n" + cursor.getString(0)
                    + " => "
                    + cursor.getString(1)
                    + " - "
                    + cursor.getString(2)
                    + " => "
                    + cursor.getString(3)
                    + " - "
                    + cursor.getString(4)
                    + " ₺ "
                    + "\n");
        }
    }catch (Exception e)
    {

    }
    db.close();
    return veriler;
    }
    public void addTicket(String email,String bilet)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("email",email);
        cv.put("bilet",bilet);
        db.insert("userticket",null,cv);

    }
    public List<String> displayTickets(String email)
    {
        List<String> biletler = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try
        {
            Cursor cursor = db.rawQuery("SELECT * FROM userticket WHERE email='" + email + "'",null);
            while(cursor.moveToNext())
            {
                biletler.add("\n" + cursor.getString(1)
                + "\n");
            }
        }catch (Exception e)
        {

        }
        db.close();
        return biletler;
    }



}
