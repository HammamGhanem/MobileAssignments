package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName , password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editTextTextName);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.buttonlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString().trim();
                SharedPreferences preferences = getSharedPreferences("LoginName", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", name);
                editor.apply();
                String editUserName , editPassword;
                editUserName = userName.getText().toString().trim();
                editPassword = password.getText().toString().trim();

                if (editUserName.isEmpty() || editPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter the Username and Password", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login successfully ", Toast.LENGTH_LONG).show();
                }



            }

        });
    }
    }