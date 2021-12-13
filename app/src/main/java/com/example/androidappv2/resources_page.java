package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class resources_page extends AppCompatActivity {
    //this is the function that handles the resources page call
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the next state
        setContentView(R.layout.activity_resources_page); // actually changes what is viewed to the resource page state
    }
}