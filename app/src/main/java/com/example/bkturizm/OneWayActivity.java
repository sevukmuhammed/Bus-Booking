package com.example.bkturizm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class OneWayActivity extends AppCompatActivity {
    TextView textView1,textView2;
    CalendarView calenderView;
    String date="";
    Button onayla;
    String email="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_way);

        calenderView = findViewById(R.id.calander);
        textView1 = findViewById(R.id.sehir1);
        textView2 = findViewById(R.id.sehir2);
        onayla = findViewById(R.id.onayla);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String city1 =(String) bundle.get("sehir1");
            String city2 = (String) bundle.get("sehir2");
            email = (String) bundle.get("email");
            textView1.setText(city1);
            textView2.setText(city2);
        }

        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                date = dayOfMonth + "/" + (month + 1) + "/" + year;

            }
        });
        onayla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OneWayActivity.this,PriceActivity.class);
                intent.putExtra("date",date);
                intent.putExtra("sehir1",textView1.getText().toString());
                intent.putExtra("sehir2",textView2.getText().toString());
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });

    }
}
