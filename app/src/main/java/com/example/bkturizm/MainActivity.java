package com.example.bkturizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText name,surname,email,phone,password,cpassword;
    DatabaseHelper db;

    Button signUp, login;
    String stringName = "",stringSurname = "",stringEmail = "",stringPassword="",stringPhone="" ,stringcPassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        cpassword = findViewById(R.id.password2);
        phone = findViewById(R.id.phone);
        signUp = findViewById(R.id.signUp);
        login = findViewById(R.id.login);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stringName = name.getText().toString();
                stringSurname = surname.getText().toString();
                stringEmail = email.getText().toString();
                stringPhone = phone.getText().toString();
                stringPassword = password.getText().toString();
                stringcPassword = cpassword.getText().toString();
                if(stringName.equals("") || stringSurname.equals("") || stringEmail.equals("") || stringPhone.equals("") || stringPassword.equals("") || stringcPassword.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Tüm Boşlukları Doldurunuz",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(stringPassword.equals(stringcPassword))
                    {
                        Boolean cemail = db.cEmail(stringEmail);
                        if(cemail == true)
                        {
                            Boolean insert = db.insertUser(stringName,stringSurname,stringEmail,stringPhone,stringPassword);

                            if(insert == true)
                            {
                                Toast.makeText(getApplicationContext(),"Üye olundu",Toast.LENGTH_LONG).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Girmiş olduğunuz Email kullanılmaktadır..",Toast.LENGTH_LONG).show();
                        }

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Girdiğiniz şifreler uyuşmamaktadır.",Toast.LENGTH_LONG).show();
                    }

                }

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);



            }
        });

    }
}
