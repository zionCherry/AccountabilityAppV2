package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Create_Button_Page extends AppCompatActivity {
    //this section runs the create button page extension
    //This is the logic to obtain user data from the required fields in the app
    String tempGroupName, tempGroupObj;
    int tempMemNum;
    public ArrayList <GroupInfo> groupInfoArrayList;

    EditText tempEditGroupName;
    EditText tempEditMemNum;
    EditText tempEditGroupObj;

    Button submitButton;
    int groupNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the instance for the for the state that will be viewed
        setContentView(R.layout.activity_create_button_page);//actually is responsible for changing what page is viewed

        tempEditGroupName = (EditText)  findViewById(R.id.editGroupName);
        tempEditMemNum =  (EditText)  findViewById(R.id.editMemNum);
        tempEditGroupObj =  (EditText)  findViewById(R.id.editGroupObj);
        String groupName = tempEditGroupName.getText().toString();
        
        submitButton =      (Button)    findViewById(R.id.subButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempEditGroupName = (EditText)  findViewById(R.id.editGroupName);
                tempEditMemNum =  (EditText)  findViewById(R.id.editMemNum);
                tempEditGroupObj =  (EditText)  findViewById(R.id.editGroupObj);

                tempGroupName = tempEditGroupName.getText().toString();
                tempMemNum = Integer.valueOf(tempEditMemNum.getText().toString());
                tempGroupObj = tempEditGroupObj.getText().toString();

                groupInfoArrayList.add(new GroupInfo(tempGroupName, tempMemNum, tempGroupObj));



                openEnterNamesPage(groupNum);

            }

            private void openEnterNamesPage(int groupNum)
            {
                Intent openGroupNames = new Intent(Create_Button_Page.this,enter_groupnames_page.class);
                startActivity(openGroupNames);
            }
        });
    }
}

