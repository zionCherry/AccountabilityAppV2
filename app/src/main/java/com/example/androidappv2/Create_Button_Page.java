package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create_Button_Page extends AppCompatActivity {
    //this section runs the create button page extension
    //This is the logic to obtain user data from the required fields in the app
    String groupName, groupObj;
    int groupNum;

    EditText editGroupName;
    EditText editGroupNum;
    EditText editGroupObj;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the instance for the for the state that will be viewed
        setContentView(R.layout.activity_create_button_page);//actually is responsible for changing what page is viewed

         editGroupName = (EditText)  findViewById(R.id.editGroupName);
         editGroupNum =  (EditText)  findViewById(R.id.editGroupNum);
         editGroupObj =  (EditText)  findViewById(R.id.editGroupObj);
         submitButton =  (Button)    findViewById(R.id.subButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                groupName = editGroupName.getText().toString();
                groupNum = Integer.valueOf(editGroupNum.getText().toString());
                groupObj = editGroupObj.getText().toString();

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

