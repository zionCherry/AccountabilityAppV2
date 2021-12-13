package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class goal_submission_page extends AppCompatActivity {

    EditText title;
    EditText startdate;
    EditText enddate;
    EditText description;
    EditText email;
    Button submitbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_submission_page);

        title = findViewById(R.id.title);
        startdate  = findViewById(R.id.start_event);
        enddate = findViewById(R.id.end_event);
        description = findViewById(R.id.description);
        submitbutton = findViewById(R.id.submitbutton);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!title.getText().toString().isEmpty()
                    && !description.getText().toString().isEmpty()
                        && !email.getText().toString().isEmpty()) {

                    Intent intent = new Intent(Intent.ACTION_INSERT);
                    intent.setData(CalendarContract.Events.CONTENT_URI);

                    intent.putExtra(CalendarContract.Events.TITLE, title.getText().toString());
                    intent.putExtra(CalendarContract.Events.DESCRIPTION, description.getText().toString());
                    intent.putExtra(CalendarContract.Events.ALL_DAY,true);
                    intent.putExtra(Intent.EXTRA_EMAIL,"test@google.com, test@goodgle.com, test@google.com");

                    if(intent.resolveActivity(getPackageManager()) !=null){
                        startActivity(intent);
                    } else
                    {
                        Toast.makeText(goal_submission_page.this,"Please fill all the fields",
                            Toast.LENGTH_SHORT).show();

                    }


                }
            }
        });
        };
    }