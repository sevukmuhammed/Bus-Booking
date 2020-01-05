package com.example.bkturizm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Buy2Activity extends AppCompatActivity {

    TextView textView,textView2;
    Button buy,back;
    Context context = this;
    boolean buying = false;
    String donusBileti="";
    String gidisBileti="";
    DatabaseHelper db;
    String email="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy2);
        textView = findViewById(R.id.bilet);
        buy = findViewById(R.id.buy);
        back = findViewById(R.id.back);
        textView2 = findViewById(R.id.bilet2);
        db = new DatabaseHelper(this);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            donusBileti =(String) bundle.get("donusbileti");
            gidisBileti = (String) bundle.get("gidisbileti");
            email = (String) bundle.get("email");


            textView2.setText(donusBileti + "\n");
            textView.setText(gidisBileti + "\n");
        }

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Satın alma işlemi tamamlandı",Toast.LENGTH_LONG).show();
                buying = true;
                db.addTicket(email,gidisBileti);
                db.addTicket(email,donusBileti);
                buy.setVisibility(View.INVISIBLE);


            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buying == true)
                {
                    Intent in = new Intent(Buy2Activity.this,Gecici.class);
                    in.putExtra("email",email);

                    startActivity(in);
                }
                else
                {
                    String title = "Uyarı";
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(context,R.style.AlertDialog);

                    alertDialog.setTitle(title)
                            .setMessage("Çıkmak istediğinize emin misiniz")
                            .setCancelable(false)
                            .setIcon(R.drawable.bus)
                            .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(Buy2Activity.this,Gecici.class);
                                    intent.putExtra("email",email);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                    AlertDialog dialog = alertDialog.create();
                    dialog.show();

                }

            }
        });



    }
}
