package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Create_Button_Page extends AppCompatActivity {
    //this section runs the create button page extension
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the instance for the for the state that will be viewed
        setContentView(R.layout.activity_create_button_page);//actually is responsible for changing what page is viewed
    }
}