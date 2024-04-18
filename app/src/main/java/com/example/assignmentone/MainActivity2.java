package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button swimmingPool , tableTennis;
    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewWelcome = findViewById(R.id.textView2ndActv);
        swimmingPool = findViewById(R.id.buttonSwimming);
        tableTennis = findViewById(R.id.buttonTableTennis);
        SharedPreferences preferences = getSharedPreferences("LoginName", MODE_PRIVATE);
        String name = preferences.getString("name", "");

        textViewWelcome.setText("Hey "+name+"!! , You can Reserve whatever you want Here");


        swimmingPool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SwimmingPool.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "تع بورد ", Toast.LENGTH_LONG).show();

            }
        });

        tableTennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, TableTennis.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "come play tennis ", Toast.LENGTH_LONG).show();

            }
        });
    }
}