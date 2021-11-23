package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class view_team_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_team_button);

        Button btnView =  findViewById(R.id.goalSubmissionButton);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoalSubmissionPage();
            }
            private void openGoalSubmissionPage()
            {
                Intent openViewTeam = new Intent(view_team_button.this,goal_submission_page.class);
                startActivity(openViewTeam);
            }
        });}}