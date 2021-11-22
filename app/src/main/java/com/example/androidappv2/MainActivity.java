package com.example.androidappv2;

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
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        //btnCreate.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Create Group Button is Clicked", Toast.LENGTH_SHORT)
                        //.show();
            //}
        //});

        Button btnView = (Button) findViewById(R.id.buttonView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "View Group Button is Clicked", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }
    }