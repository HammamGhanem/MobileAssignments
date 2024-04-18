package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TableTennis extends AppCompatActivity {
    private EditText Name;
    private EditText Grade;
    private RadioButton Male;
    private RadioButton Female;
    private EditText MonthDay;
    private EditText HourMinute;
    private Button Reserve;
    private TextView TennisData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_tennis);

        Name = findViewById(R.id.editNameTennis);
        Grade = findViewById(R.id.editGradeTennis);
        Male = findViewById(R.id.radioMaleTennis);
        Female = findViewById(R.id.radioFemaleTennis);
        MonthDay = findViewById(R.id.editTextReserveTennisMMDD);
        HourMinute = findViewById(R.id.editTextReserveTennisHHDD);
        Reserve = findViewById(R.id.buttonReserveTennis);
        TennisData = findViewById(R.id.textViewTennisData);

        Reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String grade = Grade.getText().toString();
                String gender = Male.isChecked() ? "Male" : "Female";
                String timeslot1 = MonthDay.getText().toString();
                String timeslot2 = HourMinute.getText().toString();

                String message = "" + name + "\t From " + grade + "\t grade \n Booked this Time : " + timeslot1 + " at \t" + timeslot2;
                TennisData.setText(message);
            }
        });
    }
}