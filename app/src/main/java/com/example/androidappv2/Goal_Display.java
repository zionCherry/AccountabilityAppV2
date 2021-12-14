package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Goal_Display extends AppCompatActivity {



    String title;
    String description;
    String location;
    private static final String GOAL_TITLE = "GOAL_TITLE";
    private static final String GOAL_DESC = "GOAL_DESC";
    private static final String GOAL_STATUS = "GOAL_STATUS";
    private static final String GOAL_LOCATION ="GOAL_LOCATION";
    boolean goalStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_display_page);

        Intent intent = getIntent();
        title = intent.getStringExtra(GOAL_TITLE);
        goalStatus = intent.getBooleanExtra(GOAL_STATUS, false);
        description = intent.getStringExtra(GOAL_DESC);
        location = intent.getStringExtra(GOAL_LOCATION);

        TextView locationtext = findViewById(R.id.location);
        TextView descriptiontext = findViewById(R.id.description);
        TextView titletext = findViewById(R.id.title);


        locationtext.setText(location);
        titletext.setText(title);
        descriptiontext.setText(description);

    }}

            /*
                if (!title.getText().toString().isEmpty()
                        && !description.getText().toString().isEmpty() && !location.getText().toString().isEmpty()) {

                    Intent intent = new Intent(Intent.ACTION_INSERT);
                    intent.setData(CalendarContract.Events.CONTENT_URI);

                    intent.putExtra(CalendarContract.Events.TITLE, title.getText().toString());
                    intent.putExtra(CalendarContract.Events.DESCRIPTION, description.getText().toString());
                    intent.putExtra(CalendarContract.Events.EVENT_LOCATION, location.getText().toString());
                    intent.putExtra(CalendarContract.Events.ALL_DAY, true);
                    intent.putExtra(Intent.EXTRA_EMAIL, "test@google.com");

                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);

                    } else {
                        Toast.makeText(goal_submission_page.this, "there is no app that can support this action",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(goal_submission_page.this, "Please fill all the fields",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });*/
