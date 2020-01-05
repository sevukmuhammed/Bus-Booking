package com.example.bkturizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Gecici extends AppCompatActivity implements
    AdapterView.OnItemSelectedListener{
        String[] city = {"İstanbul","Ankara","İzmir","Kayseri","Antalya","Bursa","Edirne","Muğla","Adana","Kocaeli","Adıyaman","Sinop","Erzincan","Erzurum","Malatya","Urfa","Ordu","Sivas","Giresun","Hatay"};
        Button tekYon,gidisGelis,biletlerim,gecmis,giris;
        Bundle bundle;
        String email = "";
        int posit;
        DatabaseHelper db;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gecici);
            tekYon = findViewById(R.id.tekYon);
            gidisGelis = findViewById(R.id.gidisGelis);
            biletlerim = findViewById(R.id.giris);
            gecmis = findViewById(R.id.gecmis);
            giris = findViewById(R.id.giris);
            db = new DatabaseHelper(this);

            final Spinner spin =  findViewById(R.id.spinner1);
            final Spinner spin1 = findViewById(R.id.spinner2);
            spin.setOnItemSelectedListener(Gecici.this);
            spin1.setOnItemSelectedListener(Gecici.this);
            ArrayAdapter aa = new ArrayAdapter(Gecici.this,android.R.layout.simple_spinner_item,city);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(aa);
            spin1.setAdapter(aa);
            Bundle bundle = getIntent().getExtras();
            biletlerim.setVisibility(View.INVISIBLE);
            if(bundle!=null)
            {
                biletlerim.setVisibility(View.VISIBLE);
                email = (String)bundle.get("email");
            }

            tekYon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Gecici.this,OneWayActivity.class);
                    String sehir = spin.getSelectedItem().toString();
                    String sehir1 = spin1.getSelectedItem().toString();
                    intent.putExtra("sehir1",sehir);
                    intent.putExtra("sehir2",sehir1);
                    intent.putExtra("email",email);
                    startActivity(intent);
                }
            });
            gidisGelis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Gecici.this,GoingActivity.class);
                    String sehir = spin.getSelectedItem().toString();
                    String sehir1 = spin1.getSelectedItem().toString();
                    intent.putExtra("sehir1",sehir);
                    intent.putExtra("sehir2",sehir1);
                    intent.putExtra("email",email);
                    startActivity(intent);
                }
            });
            gecmis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Gecici.this,DisplayTicketsActivity.class);
                    intent.putExtra("email",email);
                    startActivity(intent);
                }
            });
            giris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Gecici.this,LoginActivity.class);
                    startActivity(intent);
                }
            });

        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posit = position;


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }



    }

