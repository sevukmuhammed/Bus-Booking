package com.example.bkturizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ReturnPriceActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;
    Button listele;
    ListView list;
    DatabaseHelper db;
    String email="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_price);

        db = new DatabaseHelper(this);

        textView1 = findViewById(R.id.sehir1);
        textView2 = findViewById(R.id.sehir2);
        textView3 = findViewById(R.id.textView3);
        listele = findViewById(R.id.listele2);
        list = findViewById(R.id.list);

        Intent intent = getIntent();

        email = intent.getStringExtra("email");
        final String date = intent.getStringExtra("date");
        final String sehir1 = intent.getStringExtra("sehir1");
        final String sehir2 = intent.getStringExtra("sehir2");

        textView1.setText(sehir1);
        textView2.setText(sehir2);
        textView3.setText(date);

        listele.setOnClickListener(new View.OnClickListener() {
            List<String> veriler = new ArrayList<String>();
            @Override
            public void onClick(View v) {
                veriler = db.display(sehir1,sehir2);
                ArrayAdapter<String> adapter = new ArrayAdapter<>(ReturnPriceActivity.this,R.layout.row,android.R.id.text1,veriler);
                list.setAdapter(adapter);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent;
                        switch (position)
                        {
                            case 0:
                                String str = veriler.get(0) + date;
                                intent = new Intent(ReturnPriceActivity.this,Going2Activity.class);
                                intent.putExtra("gidisbileti",str);
                                intent.putExtra("sehir1",sehir1);
                                intent.putExtra("sehir2",sehir2);
                                intent.putExtra("email",email);
                                startActivity(intent);
                                break;
                            case 1:
                                String str1 = veriler.get(1)+ date;
                                intent = new Intent(ReturnPriceActivity.this,Going2Activity.class);
                                intent.putExtra("gidisbileti",str1);
                                intent.putExtra("sehir1",sehir1);
                                intent.putExtra("sehir2",sehir2);
                                intent.putExtra("email",email);
                                startActivity(intent);
                                break;
                            case 2:
                                String str2 = veriler.get(2)+ date;
                                intent = new Intent(ReturnPriceActivity.this,Going2Activity.class);
                                intent.putExtra("gidisbileti",str2);
                                intent.putExtra("sehir1",sehir1);
                                intent.putExtra("sehir2",sehir2);
                                intent.putExtra("email",email);
                                startActivity(intent);
                                break;
                        }
                    }
                });
            }
        });



    }
}
