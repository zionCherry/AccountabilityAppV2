package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class view_button_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_button_page);

        Button btnView =  findViewById(R.id.buttonViewGroup);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewTeamPage();
            }
            private void openViewTeamPage()
            {
                Intent openViewTeam = new Intent(view_button_page.this,view_team_button.class);
                startActivity(openViewTeam);
            }
        });}}