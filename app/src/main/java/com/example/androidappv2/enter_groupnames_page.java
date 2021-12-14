package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class enter_groupnames_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_groupnames_page);

        String mem1,mem2,mem3,mem4,mem5,mem6;
        EditText tempMem1,tempMem2,tempMem3,tempMem4,tempMem5,tempMem6;
        Button submitButton2;

        tempMem1 = (EditText)  findViewById(R.id.enterMem1);
        tempMem2 =  (EditText)  findViewById(R.id.enterMem2);
        tempMem3 =  (EditText)  findViewById(R.id.enterMem3);
        tempMem4 =  (EditText)  findViewById(R.id.enterMem4);
        tempMem5 =  (EditText)  findViewById(R.id.enterMem5);
        tempMem6 =  (EditText)  findViewById(R.id.enterMem6);

        submitButton2 = (Button) findViewById(R.id.subButton2);

        mem1 = tempMem1.getText().toString();
        mem2 = tempMem2.getText().toString();
        mem3 = tempMem3.getText().toString();
        mem4 = tempMem4.getText().toString();
        mem5 = tempMem5.getText().toString();
        mem6 = tempMem6.getText().toString();

        submitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openGroupDescPage();

            }

            private void openGroupDescPage()
            {
                Intent openGroupDesc = new Intent(enter_groupnames_page.this, Group_Description_Page.class);
                startActivity(openGroupDesc);
            }
        });







    }
}