package com.example.androidappv2;
//nothing crazy just trying to see if this will commit
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        });}}