package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class goal_submission_page extends AppCompatActivity {



    String title;
    String description;
    String startTime;
    String endTime;
    String location;
    private static final String GOAL_TITLE = "GOAL_TITLE";
    private static final String GOAL_START = "GOAL_START";
    private static final String GOAL_END = "GOAL_END";
    private static final String GOAL_DESC = "GOAL_DESC";
    private static final String GOAL_STATUS = "GOAL_STATUS";
    private static final String GOAL_LOCATION ="GOAL_LOCATION";
    boolean goalStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_submission_page);


        TextView swipeText = findViewById(R.id.textView3);
        Intent intent = getIntent();
        title = intent.getStringExtra(GOAL_TITLE);
        goalStatus = intent.getBooleanExtra(GOAL_STATUS, false);
        description = intent.getStringExtra(GOAL_DESC);
        location = intent.getStringExtra(GOAL_LOCATION);
        setgoalentry();

    }
    public void setdata() {
        try {
            EditText edit_title = findViewById(R.id.title);
            EditText edit_location = findViewById(R.id.locationtext);
            EditText edit_description = findViewById(R.id.description);
            String title_entry = edit_title.getText().toString();
            String location_entry = edit_location.getText().toString();
            String description_entry = edit_description.getText().toString();
            title = title_entry;
            location = location_entry;
            description = description_entry;
        }
        catch(NullPointerException e){
            Toast t = Toast.makeText(this, "Error: Fill out Remaining Fields", Toast.LENGTH_LONG);
            t.show();
        }
    }
    public void setgoalentry() {
        Button unlockButton = findViewById(R.id.submitbutton);

        unlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setdata();

                Intent screen = getIntent();
                int curActivity = screen.getIntExtra("CUR_SCREEN", 0);

                Intent intent = new Intent(getBaseContext(), Goal_Display.class);
                intent.putExtra(GOAL_TITLE,title);
                intent.putExtra(GOAL_LOCATION, location);
                intent.putExtra(GOAL_DESC, description);


                startActivity(intent);

            }
        });
    }
}
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
