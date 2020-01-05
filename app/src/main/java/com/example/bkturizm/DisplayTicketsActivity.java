package com.example.bkturizm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class DisplayTicketsActivity extends AppCompatActivity {
    ListView list;
    DatabaseHelper db;
    Bundle bundle;
    String email="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_tickets);
        list = findViewById(R.id.list);
        bundle = getIntent().getExtras();
        if(bundle != null)
        {
            email = (String)bundle.get("email");

        }
        db = new DatabaseHelper(this);
        List<String> biletler = new ArrayList<String>();
        biletler = db.displayTickets(email);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(DisplayTicketsActivity.this,R.layout.row,android.R.id.text1,biletler);
        list.setAdapter(adapter);

    }
}
