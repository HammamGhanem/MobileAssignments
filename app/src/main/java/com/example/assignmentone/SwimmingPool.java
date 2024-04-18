package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SwimmingPool extends AppCompatActivity {
    private EditText Name;
    private EditText Grade;
    private RadioButton Male;
    private RadioButton Female;
    private EditText MonthDay;
    private EditText HourMinute;
    private Button Reserve;
    private TextView SwimmingData;
    private ListView listView;
    private List<String> list;
    private String[] things;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming_pool);

        Name = findViewById(R.id.editNameSwimming);
        Grade = findViewById(R.id.editGradeSwimming);
        Male = findViewById(R.id.radioMaleTennis);
        Female = findViewById(R.id.radioFemaleTennis);
        MonthDay = findViewById(R.id.editTextReserveSwimmingMMDD);
        HourMinute = findViewById(R.id.editTextReserveSwimmingHHDD);
        Reserve = findViewById(R.id.buttonReserveSwimming);
        listView = findViewById(R.id.List_Res);
        list = new ArrayList<>();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        Reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String grade = Grade.getText().toString();
                String gender = Male.isChecked() ? "Male" : "Female";
                String timeslot1 = MonthDay.getText().toString();
                String timeslot2 = HourMinute.getText().toString();

                String message = "" + name + "\t From " + grade + "\t grade \n Booked this Time : " + timeslot1 + " at \t" + timeslot2;
                String data = "UserName : "+name+" Grade:"+grade+"\n Date:"+timeslot1+" Time:"+timeslot2;

                list.add(data);
                adapter.notifyDataSetChanged();


            }
        });

    }
}