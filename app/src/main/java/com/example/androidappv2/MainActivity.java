package com.example.androidappv2;
//nothing crazy just trying to see if this will commit
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFind = (Button) findViewById(R.id.buttonFind);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Find Group Button is Clicked", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button btnCreate = (Button) findViewById(R.id.buttonCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Create Group Button is Clicked", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button btnView = (Button) findViewById(R.id.buttonView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "View Group Button is Clicked", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
    }