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

public class BuyActivity extends AppCompatActivity {

    TextView textView;
    String str;
    Button buy,back;
    Context context = this;
    boolean buying = false;
    DatabaseHelper db;
    String email="";
    String date="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        textView = findViewById(R.id.bilet);
        buy = findViewById(R.id.buy);
        back = findViewById(R.id.back);
        db = new DatabaseHelper(this);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            str =(String) bundle.get("deger");
            date = (String) bundle.get("date");
            email = (String) bundle.get("email");
            textView.setText(str + "\n");
        }

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Satın alma işlemi tamamlandı",Toast.LENGTH_LONG).show();
                buying = true;
                buy.setVisibility(View.INVISIBLE);
                db.addTicket(email,str);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buying == true)
                {
                    Intent in = new Intent(BuyActivity.this,Gecici.class);
                    in.putExtra("olasılık",0);
                    in.putExtra("bilet",str);
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
                                    Intent intent = new Intent(BuyActivity.this,Gecici.class);
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
