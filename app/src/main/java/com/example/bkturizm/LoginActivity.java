package com.example.bkturizm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText email,password;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);

        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em = email.getText().toString();
                String ps = password.getText().toString();

                boolean chkemailpass = db.emailpassword(em,ps);
                if(chkemailpass == true)
                {
                    Intent intent = new Intent(LoginActivity.this,Gecici.class);
                    intent.putExtra("email",em);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong email or password",Toast.LENGTH_LONG).show();
                }
           }
        });
    }
}
