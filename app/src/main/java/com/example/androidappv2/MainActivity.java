package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // this is the code that handles the main activity from the main page after the splash
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this section handles connecting the main page to the find group page
        Button btnFind = findViewById(R.id.buttonFind);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFindGroupPage();
            }
            private void openFindGroupPage()
            {
                Intent openFind = new Intent(MainActivity.this,find_button_page.class);
                startActivity(openFind);
            }
        });
        //this section handles connecting the main page to the create group page
        Button btnCreate =  findViewById(R.id.buttonCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreateGroupPage();
            }

            private void openCreateGroupPage()
            {
                Intent openCreate = new Intent(MainActivity.this,Create_Button_Page.class);
                startActivity(openCreate);
            }
        });

        //this section handles connecting the main page to the view group page
        Button btnView =  findViewById(R.id.buttonView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewGroupPage();
            }
            private void openViewGroupPage()
            {
                Intent openView = new Intent(MainActivity.this,view_button_page.class);
                startActivity(openView);
            }
        });

        //this section handles the connection to the resource page
        Button btnRec =  findViewById(R.id.buttonResources);
        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openResourcesPage();
            }

            private void openResourcesPage()
            {
                Intent openRec = new Intent(MainActivity.this,resources_page.class);
                startActivity(openRec);
            }
        });



    }}