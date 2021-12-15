package com.example.androidappv2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class user_profile_Page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the next state
        setContentView(R.layout.activity_user_profile_page); // actually changes what is viewed to the resource page state
    }
}
