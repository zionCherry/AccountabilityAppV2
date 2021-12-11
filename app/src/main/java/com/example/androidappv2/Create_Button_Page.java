package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Create_Button_Page extends AppCompatActivity {
    //this section runs the create button page extension
    String groupName, groupObj;
    int groupNum;

    EditText editGroupName;
    EditText editGroupNum;
    EditText editGroupObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the instance for the for the state that will be viewed
        setContentView(R.layout.activity_create_button_page);//actually is responsible for changing what page is viewed

         editGroupName = (EditText) findViewById(R.id.editGroupName);
         editGroupNum = (EditText) findViewById(R.id.editGroupNum);
         editGroupObj = (EditText) findViewById(R.id.editGroupObj);

    }
}

